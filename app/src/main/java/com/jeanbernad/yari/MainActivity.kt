package com.jeanbernad.yari

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import cafe.adriel.voyager.navigator.Navigator
import com.jeanbernad.theme.AppTheme
import com.jeanbernad.yari.presentation.BaseActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            AppTheme {
                Inner {
                    Navigator(MainParentScreen())
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun Preview() {
        Inner {}
    }

    @Composable
    fun Inner(content: @Composable BoxScope.() -> Unit) {
        Box(
            modifier = Modifier.fillMaxSize().background(
                alpha = 0.06f,
                brush = AppTheme
                    .gradients()
                    .lightGreen()
            )
        ) {
            content()
        }
    }
}