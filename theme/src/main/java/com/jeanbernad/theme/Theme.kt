package com.jeanbernad.theme

import androidx.compose.runtime.Composable
import com.jeanbernad.theme.colors.theme.ThemeColors
import com.jeanbernad.theme.dimension.DimensionSizes
import com.jeanbernad.theme.gradient.Gradients
import com.jeanbernad.theme.typography.TypographyTypes

interface Theme {

    @Composable
    fun colors(): ThemeColors

    @Composable
    fun typography(): TypographyTypes

    @Composable
    fun dimensions(): DimensionSizes

    @Composable
    fun gradients(): Gradients

}