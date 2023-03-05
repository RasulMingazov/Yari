package com.jeanbernad.yari

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.registry.rememberScreen
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.jeanbernad.home.presentation.HomeScreens


class MainParentScreen : Screen {

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        val homeScreen = rememberScreen(HomeScreens.Home)
        navigator.push(homeScreen)
    }
}