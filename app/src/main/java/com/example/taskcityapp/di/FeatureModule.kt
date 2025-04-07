package com.example.taskcityapp.di

import com.example.taskcityapp.settings_api.api.SettingsFeatureApi
import com.example.taskcityapp.settings_impl.api.SettingsFeatureApiImpl
import com.example.taskcityapp.achievements_api.api.AchievementsFeatureApi
import com.example.taskcityapp.achievements_impl.api.AchievementsFeatureApiImpl
import com.example.taskcityapp.city_api.api.CityFeatureApi
import com.example.taskcityapp.city_impl.api.CityFeatureApiImpl
import com.example.taskcityapp.tasks_api.api.TasksFeatureApi
import com.example.taskcityapp.tasks_impl.api.TasksFeatureApiImpl
import dagger.Binds
import dagger.Module


@Module
interface FeatureModule {

    @Binds
    fun bindAchievementsFeature(achievementsFeatureApiImpl: AchievementsFeatureApiImpl): AchievementsFeatureApi
    @Binds
    fun bindCityFeature(mainFeatureApiImpl: CityFeatureApiImpl): CityFeatureApi
    @Binds
    fun bindSettingsFeature(settingsFeatureApiImpl: SettingsFeatureApiImpl): SettingsFeatureApi
    @Binds
    fun bindTasksFeature(tasksFeatureApiImpl: TasksFeatureApiImpl): TasksFeatureApi

}