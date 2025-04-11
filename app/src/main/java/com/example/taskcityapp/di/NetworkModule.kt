package com.example.taskcityapp.di

import com.example.data_api.api.NewsRepository
import com.example.data_impl.network.api.HackerNewsApiService
import com.example.data_impl.repository.NewsRepositoryImpl
import com.example.taskcity.city_impl.domain.GetStoryUseCase
import com.example.taskcity.city_impl.domain.GetTopStoriesUseCase
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.Reusable
import kotlinx.coroutines.Dispatchers
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Qualifier

@Module
class NetworkModule {

    @Provides
    fun moshi(): Moshi {
        return Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
    }
    @Provides
    fun retrofit(moshi: Moshi): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://hacker-news.firebaseio.com/v0/")
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
    }

    @Provides
    fun hackerNewsApiService(retrofit: Retrofit): HackerNewsApiService {
        return retrofit.create(HackerNewsApiService::class.java)
    }

    @Provides
    fun newsRepository(apiService: HackerNewsApiService): NewsRepository {
        return NewsRepositoryImpl(
            apiService = apiService,
            dispatcher = Dispatchers.IO
        )
    }

    // useCases







    //@Provides
    //@Reusable
    //fun provideGson(): Gson {
    //    return GsonBuilder()
    //        .setDateFormat("yyyy-MM-dd'T'HH:mm:ssz")
    //        .create()
    //}

    //@Provides
    //fun provideNewsApi(
    //    @ApiUrl apiUrl: String,
    //    @ApiPath newsPath: String,
    //    gson: Gson,
    //): ApiService {
    //    return NewsApi(
    //        apiUrl = apiUrl + newsPath,
    //        gson = gson
    //    )
    //}

    //@Provides
    //@ApiUrl
    //fun provideBaseApiUrl(): String {
    //    return BuildConfig.KIPARO_BASE_API_URL
    //}
//
    //@Provides
    //@ApiPath
    //fun provideNewsApiPath(): String {
    //    return BuildConfig.KIPARO_NEWS_API_PATH
    //}
}

//@Qualifier
//@Retention(AnnotationRetention.RUNTIME)
//annotation class ApiUrl
//
//@Qualifier
//@Retention(AnnotationRetention.RUNTIME)
//annotation class ApiPath

