package com.jeanbernad.theme.colors.palette

import com.jeanbernad.theme.colors.theme.ThemeColors

interface PaletteColors {

    fun darkMode(): ThemeColors

    fun lightMode(): ThemeColors
}