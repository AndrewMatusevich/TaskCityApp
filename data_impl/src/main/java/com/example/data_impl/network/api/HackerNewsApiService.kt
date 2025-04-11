package com.example.data_impl.network.api

import com.example.data_impl.network.models.NewsItemNetwork
import com.example.data_impl.network.models.NewsUpdatesNetwork
import com.example.data_impl.network.models.NewsUserNetwork
import retrofit2.http.GET
import retrofit2.http.Path

interface HackerNewsApiService {
    @GET("item/{id}.json")
    suspend fun getItem(@Path("id") id: Long): NewsItemNetwork

    @GET("user/{id}.json")
    suspend fun getUser(@Path("id") id: String): NewsUserNetwork

    @GET("updates.json")
    suspend fun getUpdates(): NewsUpdatesNetwork

    @GET("topstories.json")
    suspend fun getTopStories(): List<Long>

    @GET("newstories.json")
    suspend fun getNewStories(): List<Long>

    @GET("beststories.json")
    suspend fun getBestStories(): List<Long>

    @GET("askstories.json")
    suspend fun getAskStories(): List<Long>

    @GET("showstories.json")
    suspend fun getShowStories(): List<Long>

    @GET("jobstories.json")
    suspend fun getJobStories(): List<Long>
}

