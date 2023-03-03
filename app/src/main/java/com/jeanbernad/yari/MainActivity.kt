package com.jeanbernad.yari

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.jeanbernad.theme.AppTheme
import com.jeanbernad.yari.presentation.BaseActivity
import com.jeanbernad.yari.ui.navigation.home.AppNavigationGraph

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            AppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    AppNavigationGraph(navController = rememberNavController())
                }
            }
        }
    }
}