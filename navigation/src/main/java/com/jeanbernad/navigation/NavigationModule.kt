package com.jeanbernad.navigation

import cafe.adriel.voyager.core.registry.ScreenRegistry

interface NavigationModule {

    fun module(): ScreenRegistry.() -> Unit
}