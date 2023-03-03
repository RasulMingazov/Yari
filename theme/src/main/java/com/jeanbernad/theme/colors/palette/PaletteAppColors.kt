package com.jeanbernad.theme.colors.palette

import com.jeanbernad.theme.colors.local.LocalAppColors
import com.jeanbernad.theme.colors.theme.AppThemeColors

class PaletteAppColors : PaletteColors {

    private val localColors = LocalAppColors()

    override fun lightMode() = AppThemeColors(
        primary = localColors.pink(),
        secondary = localColors.lime(),
        firstBackground = localColors.lightLime(),
        secondBackground = localColors.lightPink(),
        thirdBackground = localColors.partyPink(),
        textColor = localColors.black(),
        secondTextColor = localColors.white()
    )

    override fun darkMode() = AppThemeColors(
        primary = localColors.pink(),
        secondary = localColors.lime(),
        firstBackground = localColors.lightLime(),
        secondBackground = localColors.lightPink(),
        thirdBackground = localColors.partyPink(),
        textColor = localColors.white(),
        secondTextColor = localColors.black()
    )
}