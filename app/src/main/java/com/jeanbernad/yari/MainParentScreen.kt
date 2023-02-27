package com.jeanbernad.yari

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.compose.rememberNavController
import com.jeanbernad.yari.ui.navigation.home.MainNavigationGraph
import com.jeanbernad.yari.ui.topbar.YariTopBar

@Composable
fun MainParentScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { YariTopBar(stringResource(id = R.string.app_name_caps)) },
        content = { padding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding),
            ) {
                MainNavigationGraph(navController = rememberNavController())
            }
        }
    )
}