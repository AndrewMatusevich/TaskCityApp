package com.example.taskcityapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.taskcity.settings_api.api.SettingsFeatureApi
import com.example.taskcity.achievements_api.api.AchievementsFeatureApi
import com.example.taskcity.city_api.api.CityFeatureApi
import com.example.taskcity.tasks_api.api.TasksFeatureApi
import com.example.taskcityapp.ui.BottomTabs


@Composable
fun MainNavHost(
    navController: NavHostController,
    cityFeature: CityFeatureApi,
    achievementsFeature: AchievementsFeatureApi,
    tasksFeature: TasksFeatureApi,
    settingsFeature: SettingsFeatureApi,
    modifier: Modifier = Modifier
) {
    NavHost(navController = navController, startDestination = "city"){
        cityFeature.registerDestination(this)
        achievementsFeature.registerDestination(this)
        tasksFeature.registerDestination(this)
        settingsFeature.registerDestination(this)
    }
}