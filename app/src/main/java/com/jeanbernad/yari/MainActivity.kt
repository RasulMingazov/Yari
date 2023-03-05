package com.jeanbernad.yari

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import cafe.adriel.voyager.navigator.Navigator
import com.jeanbernad.theme.AppTheme
import com.jeanbernad.yari.presentation.BaseActivity
import com.jeanbernad.yari.ui.topbar.YariTopBar

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            AppTheme {
                Content()
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun Content() {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = { YariTopBar(stringResource(id = R.string.app_name_caps)) },
            content = { padding ->
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(padding)
                        .background(
                            brush = AppTheme
                                .gradients()
                                .lightGreen(),
                            alpha = 0.06f
                        ),
                ) {
                    Navigator(MainParentScreen())
                }
            }
        )
    }
}