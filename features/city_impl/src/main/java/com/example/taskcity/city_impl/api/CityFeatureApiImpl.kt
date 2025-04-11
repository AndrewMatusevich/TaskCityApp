package com.example.taskcity.city_impl.api

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.taskcity.city_api.api.CityFeatureApi
import com.example.taskcity.city_impl.presentation.City
import com.example.taskcity.city_impl.presentation.HomeViewModel
import javax.inject.Inject


class CityFeatureApiImpl @Inject constructor(
    private val homeViewModelFactory: HomeViewModel.HomeViewModelFactory
): CityFeatureApi {
    override fun registerDestination(navGraphBuilder: NavGraphBuilder) {
        navGraphBuilder.composable("city") {
            City(viewModelFactory = homeViewModelFactory)
        }
    }
}