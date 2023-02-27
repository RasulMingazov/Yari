package com.jeanbernad.yari.ui.navigation.home

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.jeanbernad.yari.ui.home.HomeParentScreen

@Composable
fun MainNavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = "HomeParent") {
        composable("HomeParent") {
            HomeParentScreen()
        }
    }
}