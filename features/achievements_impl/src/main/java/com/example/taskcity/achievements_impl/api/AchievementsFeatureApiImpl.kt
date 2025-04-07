package com.example.taskcity.achievements_impl.api

import com.example.taskcity.achievements_api.api.AchievementsFeatureApi
import javax.inject.Inject
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.taskcity.achievements_impl.presentation.Achievements


class AchievementsFeatureApiImpl @Inject constructor(): AchievementsFeatureApi {
    override fun registerDestination(navGraphBuilder: NavGraphBuilder) {
        navGraphBuilder.composable("achievements") {
            Achievements()
        }
    }
}