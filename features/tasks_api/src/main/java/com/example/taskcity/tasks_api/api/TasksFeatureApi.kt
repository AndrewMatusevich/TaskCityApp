package com.example.taskcity.tasks_api.api

import androidx.navigation.NavGraphBuilder


interface TasksFeatureApi {
    fun registerDestination(navGraphBuilder: NavGraphBuilder)
}