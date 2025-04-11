package com.example.taskcityapp.di

import com.example.data_api.api.NewsRepository
import com.example.taskcity.city_impl.domain.GetStoryUseCase
import com.example.taskcity.city_impl.domain.GetTopStoriesUseCase
import com.example.taskcity.city_impl.presentation.HomeViewModel
import com.example.taskcityapp.navigation.MainNavHost
import com.example.taskcityapp.presentation.main.MainActivity
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun getTopStoriesUseCase(newsRepository: NewsRepository): GetTopStoriesUseCase {
        return GetTopStoriesUseCase(newsRepository = newsRepository)
    }
    @Provides
    fun getStoryUseCase(newsRepository: NewsRepository): GetStoryUseCase {
        return GetStoryUseCase(newsRepository = newsRepository)
    }

    @Provides
    fun provideHomeViewModel(
        getTopStoriesUseCase: GetTopStoriesUseCase,
        getStoryUseCase: GetStoryUseCase
    ): HomeViewModel.HomeViewModelFactory {
        return HomeViewModel.HomeViewModelFactory(
            getTopStoriesUseCase = getTopStoriesUseCase,
            getStoryUseCase = getStoryUseCase
        )
    }
}