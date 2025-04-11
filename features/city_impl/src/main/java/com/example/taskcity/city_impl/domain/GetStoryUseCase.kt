package com.example.taskcity.city_impl.domain

import com.example.data_api.api.NewsRepository
import com.example.domain_models.NewsItem
import javax.inject.Inject

class GetStoryUseCase @Inject constructor (private val newsRepository: NewsRepository) {
    suspend fun execute(id: Long): NewsItem {
        return newsRepository.getItem(id = id)
    }
}