package com.jeanbernad.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import com.jeanbernad.theme.colors.palette.PaletteAppColors
import com.jeanbernad.theme.colors.theme.ThemeColors
import com.jeanbernad.theme.dimension.DimensionSizes
import com.jeanbernad.theme.gradient.Gradients
import com.jeanbernad.theme.resources.AppResources
import com.jeanbernad.theme.typography.TypographyTypes

object AppTheme: Theme {

    @Composable
    override fun colors() = AppResources.localColors()

    @Composable
    override fun typography() = AppResources.localTypography()

    @Composable
    override fun dimensions() = AppResources.localDimensions()

    @Composable
    override fun gradients() = AppResources.localGradients()
}

@Composable
fun AppTheme(
    colors: ThemeColors = if (isSystemInDarkTheme()) PaletteAppColors().darkMode() else PaletteAppColors().lightMode(),
    typographyTypes: TypographyTypes = AppTheme.typography(),
    dimensionSizes: DimensionSizes = AppTheme.dimensions(),
    gradients: Gradients = AppTheme.gradients(),
    content: @Composable () -> Unit
) {
    AppResources.LocalProvider(
        content,
        colors,
        typographyTypes,
        dimensionSizes,
        gradients
    )
}