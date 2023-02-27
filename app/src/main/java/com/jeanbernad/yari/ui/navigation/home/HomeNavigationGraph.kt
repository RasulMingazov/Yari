package com.jeanbernad.yari.ui.navigation.home

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.jeanbernad.yari.ui.home.HomeScreen

@Composable
fun HomeNavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = "HomeScreen") {
        composable("HomeScreen") {
            HomeScreen()
        }
    }
}