package com.example.taskcityappapp.ui.widgets

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.taskcityappapp.ui.R

enum class BottomTabs(
    @StringRes
    val title: Int,
    @DrawableRes
    val icon: Int,
    val route: String
){
    ACHIEVEMENTS(R.string.achievements, R.drawable.ic_baseline_achievements, "achievements"),
    CITY(R.string.city, R.drawable.ic_baseline_city, "city"),
    SETTINGS(R.string.settings, R.drawable.ic_baseline_settings, "settings"),
    TASKS(R.string.tasks, R.drawable.ic_baseline_tasks, "tasks")
}