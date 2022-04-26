package com.example.docreviewdemo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.docreviewdemo.AnimatedSplashScreen
import com.example.docreviewdemo.Homepage
import com.example.docreviewdemo.screens.DashboardScreen
import com.example.docreviewdemo.screens.LoginScreen
import com.example.docreviewdemo.screens.SettingsScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Login.route
    ) {
        composable(route = NavBarScreen.Splash.route){
            AnimatedSplashScreen(navController = navController)
        }
        composable(route = Screen.Login.route){
            LoginScreen(navController = navController)
        }
        composable(route = NavBarScreen.Home.route) {
            Homepage(navController = navController)
        }
        composable(route = NavBarScreen.Profile.route) {
            DashboardScreen(navController = navController)
        }
        composable(route = NavBarScreen.Settings.route) {
            SettingsScreen(navController = navController)
        }
    }
}