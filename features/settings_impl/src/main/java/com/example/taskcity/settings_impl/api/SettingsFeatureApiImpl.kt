package com.example.taskcity.settings_impl.api

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.taskcity.settings_api.api.SettingsFeatureApi
import com.example.taskcity.settings_impl.presentation.Settings
import javax.inject.Inject


class SettingsFeatureApiImpl @Inject constructor(): SettingsFeatureApi {
    override fun registerDestination(navGraphBuilder: NavGraphBuilder) {
        navGraphBuilder.composable("settings") {
            Settings()
        }
    }
}