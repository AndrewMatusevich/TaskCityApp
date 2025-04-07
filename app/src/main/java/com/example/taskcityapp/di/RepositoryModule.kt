package com.example.taskcityapp.di

import com.example.data_api.api.DailyProgressRepository
import com.example.data_api.api.TaskRepository
import com.example.data_impl.repository.DailyProgressRepositoryImpl
import com.example.data_impl.repository.TaskRepositoryImpl
import dagger.Binds
import dagger.Module

@Module
interface RepositoryModule {

    @Binds
    fun getDailyProgressRepository(dailyProgressRepositoryImpl: DailyProgressRepositoryImpl): DailyProgressRepository
    @Binds
    fun getTaskRepository(taskRepositoryImpl: TaskRepositoryImpl): TaskRepository
}