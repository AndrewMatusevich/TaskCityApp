package com.example.taskcityapp.presentation.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.taskcity.achievements_api.api.AchievementsFeatureApi
import com.example.taskcity.city_api.api.CityFeatureApi
import com.example.taskcity.settings_api.api.SettingsFeatureApi
import com.example.taskcity.tasks_api.api.TasksFeatureApi
import com.example.taskcityapp.app.App
import com.example.taskcityapp.di.AppComponent
import com.example.taskcityapp.di.AppDiProvider
import com.example.taskcityapp.di.AppDiProvider.appComponent
import com.example.taskcityapp.di.DaggerAppComponent
import com.example.taskcityapp.presentation.navigation.AppContent
import com.example.taskcityapp.ui.theme.TaskCityAppTheme
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var cityFeature: CityFeatureApi
    @Inject
    lateinit var achievementsFeature: AchievementsFeatureApi
    @Inject
    lateinit var tasksFeature: TasksFeatureApi
    @Inject
    lateinit var settingsFeature: SettingsFeatureApi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        appComponent.inject(this)

        setContent {
            TaskCityAppTheme {
                AppContent(
                    cityFeature = cityFeature,
                    achievementsFeature = achievementsFeature,
                    tasksFeature = tasksFeature,
                    settingsFeature = settingsFeature
                )
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun MainActivityPreview() {
//    TaskCityAppTheme {
//        AppContent()
//    }
//}
