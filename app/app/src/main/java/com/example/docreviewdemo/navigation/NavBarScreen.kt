package com.example.docreviewdemo.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class NavBarScreen ( val route: String,
                            val title: String,
                            val icon: ImageVector?
) {

    object Splash : NavBarScreen(
        route = "splash_screen",
        title = "splash_screen",
        icon = Icons.Default.Home
    )
    /*
    object Login : NavBarScreen(
        route = "login_screen",
        title = "login_screen",
        icon = Icons.Default.Person
    )*/
    object Home : NavBarScreen(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )

    object Profile : NavBarScreen(
        route = "profile",
        title = "Profile",
        icon = Icons.Default.Person
    )

    object Settings : NavBarScreen(
        route = "settings",
        title = "Settings",
        icon = Icons.Default.Settings
    )
}