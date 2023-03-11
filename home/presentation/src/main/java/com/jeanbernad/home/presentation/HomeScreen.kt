package com.jeanbernad.home.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.jeanbernad.home.presentation.ui.PhotoSourceFloatingButton
import com.jeanbernad.yari.presentation.BaseScreen
import com.jeanbernad.yari.presentation.stub.EmptyScreen
import com.jeanbernad.yari.presentation.topbar.YariTopBar
import com.jeanbernad.yari.presentation.R as uiR

class HomeScreen : BaseScreen() {

    @Composable
    override fun Content() {
        Inner()
    }

    @Preview(showBackground = true)
    @Composable
    override fun Preview() {
        Inner()
    }

    @Composable
    fun Inner() {
        Scaffold(
            backgroundColor = Color.Transparent,
            topBar = { YariTopBar(stringResource(id = uiR.string.app_name_caps)) },
            floatingActionButton = {
                PhotoSourceFloatingButton(
                    gallerySourceClicked = {},
                    cameraSourceClicked = {}
                )
            },
            content = {
                Column(
                    modifier = Modifier
                        .padding(it)
                        .fillMaxSize()
                        .wrapContentSize(Alignment.Center)
                ) {
                    EmptyScreen(message = R.string.empty_message)
                }
            }
        )
    }
}