package com.jeanbernad.yari.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.jeanbernad.yari.presentation.splash.SplashState

abstract class BaseActivity : ComponentActivity(), SplashState {

    private val splashScreenCommunication = Communication.Base(false)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen().setKeepOnScreenCondition {
            return@setKeepOnScreenCondition splashScreenCommunication.flow().value
        }
    }

    override fun dataIsLoaded() {
        splashScreenCommunication.map(true)
    }
}