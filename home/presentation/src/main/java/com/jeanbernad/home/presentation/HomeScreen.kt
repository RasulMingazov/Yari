package com.jeanbernad.home.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import com.jeanbernad.yari.presentation.BaseActivity

class HomeScreen : Screen {

    @Composable
    @Preview
    override fun Content() {
        (LocalContext.current as BaseActivity).dataIsLoaded()
        Column(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.Center),

            ) {
            Text(
                text = stringResource(id = R.string.home),
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center,
                fontSize = 20.sp
            )
        }
    }
}