package com.example.taskcityapp.ui

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


enum class BottomTabs(
    @StringRes
    val title: Int,
    @DrawableRes
    val icon: Int,
    val route: String
){
    CITY(R.string.city, R.drawable.ic_baseline_city, "city"),
    TASKS(R.string.tasks, R.drawable.ic_baseline_tasks, "tasks"),
    ACHIEVEMENTS(R.string.achievements, R.drawable.ic_baseline_achievements, "achievements"),
    SETTINGS(R.string.settings, R.drawable.ic_baseline_settings, "settings"),
}