package com.jeanbernad.yari.ui.topbar

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.jeanbernad.theme.AppTheme

@Composable
fun YariTopBar(text: String) {
    TopAppBar(
        backgroundColor = AppTheme.colors().primary(),
        content = {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = text,
                textAlign = TextAlign.Center,
                color = AppTheme.colors().textColor(),
                style = AppTheme.typography().appbar()
            )
        }
    )
}