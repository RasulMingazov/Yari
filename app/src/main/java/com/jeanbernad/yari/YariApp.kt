package com.jeanbernad.yari

import android.app.Application
import cafe.adriel.voyager.core.registry.ScreenRegistry
import com.jeanbernad.home.presentation.featureHomeScreenModule

class YariApp : Application() {

    override fun onCreate() {
        super.onCreate()

        ScreenRegistry {
            featureHomeScreenModule()
        }
    }
}