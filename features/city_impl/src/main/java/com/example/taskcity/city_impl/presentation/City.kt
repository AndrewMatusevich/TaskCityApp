package com.example.taskcity.city_impl.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable
fun City(
    viewModelFactory: HomeViewModel.HomeViewModelFactory
) {
    val viewModel: HomeViewModel = viewModel(factory = viewModelFactory)

    viewModel.load()
    val story = viewModel.state.collectAsState().value.topStories.firstOrNull()?.title ?: "No text"

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(text = story)
    }
}