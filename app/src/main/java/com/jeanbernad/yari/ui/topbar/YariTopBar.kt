package com.jeanbernad.yari.ui.topbar

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

@Composable
fun YariTopBar(text: String) {
    TopAppBar(
        content = {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = text,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colors.surface,
                style = MaterialTheme.typography.caption
            )
        }
    )
}