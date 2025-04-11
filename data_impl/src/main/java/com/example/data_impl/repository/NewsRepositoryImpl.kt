package com.example.data_impl.repository

import com.example.data_api.api.NewsRepository
import com.example.data_impl.mappers.toDomain
import com.example.data_impl.network.api.HackerNewsApiService
import com.example.domain_models.NewsItem
import com.example.domain_models.NewsUpdates
import com.example.domain_models.NewsUser
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject


class NewsRepositoryImpl @Inject constructor (
    private val apiService: HackerNewsApiService,
    private val dispatcher: CoroutineDispatcher
): NewsRepository {


    override suspend fun getItem(id: Long): NewsItem {
        return withContext(dispatcher){
            try {
                apiService.getItem(id = id).toDomain()
            }
            catch (e: Exception) {
                e.printStackTrace()
                throw e
            }
        }
    }

    override suspend fun getUser(id: String): NewsUser {
        return withContext(dispatcher){
            try {
                apiService.getUser(id = id).toDomain()
            }
            catch (e: Exception) {
                e.printStackTrace()
                throw e
            }
        }
    }

    override suspend fun getUpdates(): NewsUpdates{
        return withContext(dispatcher){
            try {
                apiService.getUpdates().toDomain()
            }
            catch (e: Exception) {
                e.printStackTrace()
                throw e
            }
        }
    }


    override suspend fun getTopStories(): List<Long> {
        return withContext(dispatcher){
            try {
                apiService.getTopStories()
            }
            catch (e: Exception) {
                e.printStackTrace()
                throw e
            }
        }
    }

    override suspend fun getNewStories(): List<Long> {
        return withContext(dispatcher){
            try {
                apiService.getNewStories()
            }
            catch (e: Exception) {
                e.printStackTrace()
                throw e
            }
        }
    }

    override suspend fun getBestStories(): List<Long> {
        return withContext(dispatcher){
            try {
                apiService.getBestStories()
            }
            catch (e: Exception) {
                e.printStackTrace()
                throw e
            }
        }
    }

    override suspend fun getAskStories(): List<Long> {
        return withContext(dispatcher){
            try {
                apiService.getAskStories()
            }
            catch (e: Exception) {
                e.printStackTrace()
                throw e
            }
        }
    }

    override suspend fun getShowStories(): List<Long> {
        return withContext(dispatcher){
            try {
                apiService.getShowStories()
            }
            catch (e: Exception) {
                e.printStackTrace()
                throw e
            }
        }
    }
}