package com.jeanbernad.yari.ui.navigation.home

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.jeanbernad.yari.MainParentScreen

@Composable
fun AppNavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = "MainScreen") {
        composable("MainScreen") {
            MainParentScreen()
        }
    }
}