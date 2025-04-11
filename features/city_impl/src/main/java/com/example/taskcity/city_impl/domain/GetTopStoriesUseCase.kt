package com.example.taskcity.city_impl.domain

import com.example.data_api.api.NewsRepository
import javax.inject.Inject

class GetTopStoriesUseCase @Inject constructor (private val newsRepository: NewsRepository) {
    suspend fun execute(): List<Long> {
        return newsRepository.getTopStories()
    }
}