package com.jeanbernad.yari.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = Colors.Pink,
    primaryVariant = Colors.Purple,
    secondary = Colors.Lime,
    surface = Colors.Black,
    background = Colors.LightLime
)

private val LightColorPalette = lightColors(
    primary = Colors.Pink,
    primaryVariant = Colors.Purple,
    secondary = Colors.Lime,
    surface = Colors.Black,
    background = Colors.LightLime
)

@Composable
fun YariTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}