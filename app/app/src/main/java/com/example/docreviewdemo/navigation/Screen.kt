package com.example.docreviewdemo.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home

sealed class Screen (val route: String) {
    object Login : Screen(
        route = "login",
    )
}