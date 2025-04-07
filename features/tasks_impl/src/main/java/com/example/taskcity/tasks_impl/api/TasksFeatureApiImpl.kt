package com.example.taskcity.tasks_impl.api

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.taskcity.tasks_api.api.TasksFeatureApi
import com.example.taskcity.tasks_impl.presentation.Tasks
import javax.inject.Inject


class TasksFeatureApiImpl @Inject constructor(): TasksFeatureApi {
    override fun registerDestination(navGraphBuilder: NavGraphBuilder) {
        navGraphBuilder.composable("tasks") {
            Tasks()
        }
    }
}
