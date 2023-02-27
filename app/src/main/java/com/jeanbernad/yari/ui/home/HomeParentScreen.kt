package com.jeanbernad.yari.ui.home

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.jeanbernad.yari.ui.navigation.home.HomeNavigationGraph

@Composable
fun HomeParentScreen(){
    HomeNavigationGraph(navController = rememberNavController())
}