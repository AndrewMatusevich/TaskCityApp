package com.example.taskcityapp.presentation.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.taskcity.achievements_api.api.AchievementsFeatureApi
import com.example.taskcity.city_api.api.CityFeatureApi
import com.example.taskcity.settings_api.api.SettingsFeatureApi
import com.example.taskcity.tasks_api.api.TasksFeatureApi
import com.example.taskcityapp.ui.widgets.nav_widgets.TaskCityNavBar
import com.example.taskcityapp.ui.BottomTabs
import com.example.taskcityapp.navigation.MainNavHost

@Composable
fun AppContent(
    cityFeature: CityFeatureApi,
    achievementsFeature: AchievementsFeatureApi,
    tasksFeature: TasksFeatureApi,
    settingsFeature: SettingsFeatureApi
) {

    val tabs = remember { BottomTabs.entries.toTypedArray() }
    val navController: NavHostController = rememberNavController()

    Scaffold(
        containerColor = Color.White,
        bottomBar = { TaskCityNavBar(navController = navController, tabs) }
    ) { innerPaddingModifier ->
        MainNavHost(
            navController = navController,
            cityFeature = cityFeature,
            achievementsFeature = achievementsFeature,
            tasksFeature = tasksFeature,
            settingsFeature = settingsFeature,
            modifier = Modifier.padding(innerPaddingModifier)
        )
    }
}