package com.example.taskcity.settings_api.api

import androidx.navigation.NavGraphBuilder


interface SettingsFeatureApi {
    fun registerDestination(navGraphBuilder: NavGraphBuilder)
}