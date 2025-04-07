package com.example.taskcityapp.tasks_impl.api

import com.example.taskcityapp.tasks_api.api.TasksFeatureApi
import javax.inject.Inject

class TasksFeatureApiImpl @Inject constructor(): TasksFeatureApi {
    override fun get(): Boolean = true
}
