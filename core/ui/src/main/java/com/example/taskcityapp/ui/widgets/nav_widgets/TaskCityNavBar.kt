package com.example.taskcityapp.ui.widgets.nav_widgets

import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.taskcityapp.navigation.navigateToSingleTopTo
import com.example.taskcityapp.ui.BottomTabs


@Composable
public fun TaskCityNavBar(
    navController: NavHostController,
    bottomTabs: Array<BottomTabs>,
    modifier: Modifier = Modifier
) {

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route ?: BottomTabs.CITY.route

   val routes = remember { BottomTabs.entries.map { it.route } }
    if (currentRoute in routes) {

        NavigationBar {
            bottomTabs.forEach { tab ->
                NavigationBarItem(
                    icon = { Icon(painterResource(tab.icon), contentDescription = "Icon") },
                    label = { Text(stringResource(tab.title)) },
                    selected = false,
                    onClick = {
                        navController.navigateToSingleTopTo(tab.route)
                    },
                    modifier = Modifier.navigationBarsPadding(),
                )
            }
        }
    }
}