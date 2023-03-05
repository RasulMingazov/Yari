package com.jeanbernad.home.presentation

import cafe.adriel.voyager.core.registry.ScreenProvider
import cafe.adriel.voyager.core.registry.screenModule

sealed class HomeScreens : ScreenProvider {
    object Home : HomeScreens()
}

val featureHomeScreenModule = screenModule {
    register<HomeScreens.Home> {
        HomeScreen()
    }
}