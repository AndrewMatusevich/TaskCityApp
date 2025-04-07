package com.example.taskcityapp.presentation.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.taskcityappapp.core_ui.TaskCityNavBar
import com.example.taskcityappapp.ui.widgets.BottomTabs
import com.example.taskcityappapp.ui.widgets.MainNavHost

@Composable
fun AppContent() {

    val tabs = remember { BottomTabs.entries.toTypedArray() }
    val navController: NavHostController = rememberNavController()

    Scaffold(
        containerColor = Color.White,
        bottomBar = { TaskCityNavBar(navController = navController, tabs) }
    ) { innerPaddingModifier ->
        MainNavHost(
            navController = navController,
            modifier = Modifier.padding(innerPaddingModifier)
        )
    }
}