package com.example.taskcity.city_impl.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.domain_models.NewsItem
import com.example.taskcity.city_impl.domain.GetStoryUseCase
import com.example.taskcity.city_impl.domain.GetTopStoriesUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

data class HomeState(
    val isLoading: Boolean = false,
    val error: String? = null,
    val topStories: List<NewsItem> = emptyList()
)

class HomeViewModel (
    private val getTopStoriesUseCase: GetTopStoriesUseCase,
    private val getStoryUseCase: GetStoryUseCase
): ViewModel() {

    private val _state = MutableStateFlow(HomeState())
    val state = _state.asStateFlow()

    fun load() {
        viewModelScope.launch {
            _state.update { it.copy(isLoading = true) }

            val topStories = getTopStoriesUseCase.execute()
            val story = getStoryUseCase.execute(topStories.first())

            if (topStories.isNotEmpty()) {
                _state.update {
                    it.copy(
                        topStories = listOf(story),
                        isLoading = false
                    )
                }
            }else {
                _state.update {
                    it.copy(
                        topStories = listOf(
                            NewsItem(
                            title = "No stories",
                                id = TODO(),
                                deleted = TODO(),
                                type = TODO(),
                                by = TODO(),
                                time = TODO(),
                                text = TODO(),
                                dead = TODO(),
                                parent = TODO(),
                                poll = TODO(),
                                kids = TODO(),
                                url = TODO(),
                                score = TODO(),
                                parts = TODO(),
                                descendants = TODO()
                            )
                        ),
                        isLoading = false
                    )
                }
            }

        }
    }

    class HomeViewModelFactory(
        private val getTopStoriesUseCase: GetTopStoriesUseCase,
        private val getStoryUseCase: GetStoryUseCase
    ) : ViewModelProvider.Factory {
        override fun <T: ViewModel> create(modelClass: Class<T>): T {
            return HomeViewModel(
                getTopStoriesUseCase = getTopStoriesUseCase,
                getStoryUseCase = getStoryUseCase
            ) as T
        }
    }
}