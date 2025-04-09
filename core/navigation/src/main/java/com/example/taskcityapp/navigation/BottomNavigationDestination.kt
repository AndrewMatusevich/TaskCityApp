package com.example.taskcityapp.navigation

import androidx.annotation.StringRes


interface BottomNavigationDestination{
    val route: String
    @get:StringRes
    val image: Int
    val contentDescription: String
}
