package com.example.data_api.api

import com.example.domain_models.NewsItem
import com.example.domain_models.NewsUpdates
import com.example.domain_models.NewsUser

interface NewsRepository {

    suspend fun getItem(id: Long): NewsItem

    suspend fun getUser(id: String): NewsUser

    suspend fun getUpdates(): NewsUpdates

    suspend fun getTopStories(): List<Long>

    suspend fun getNewStories(): List<Long>

    suspend fun getBestStories(): List<Long>

    suspend fun getAskStories(): List<Long>

    suspend fun getShowStories(): List<Long>
}