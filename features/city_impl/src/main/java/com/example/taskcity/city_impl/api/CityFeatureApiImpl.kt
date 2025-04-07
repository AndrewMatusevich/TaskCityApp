package com.example.taskcity.city_impl.api

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.taskcity.city_api.api.CityFeatureApi
import com.example.taskcity.city_impl.presentation.City
import javax.inject.Inject


class CityFeatureApiImpl @Inject constructor(): CityFeatureApi {
    override fun registerDestination(navGraphBuilder: NavGraphBuilder) {
        navGraphBuilder.composable("city") {
            City()
        }
    }
}