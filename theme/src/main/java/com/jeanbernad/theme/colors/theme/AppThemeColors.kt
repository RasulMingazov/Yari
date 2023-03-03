package com.jeanbernad.theme.colors.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

class AppThemeColors(
    private val primary: Color,
    private val secondary: Color,
    private val firstBackground: Color,
    private val secondBackground: Color,
    private val thirdBackground: Color,
    private val textColor: Color,
    private val secondTextColor: Color
) : ThemeColors {

    private var primaryLocal by mutableStateOf(primary)
    private var secondaryLocal by mutableStateOf(secondary)
    private var firstBackgroundLocal by mutableStateOf(firstBackground)
    private var secondBackgroundLocal by mutableStateOf(secondBackground)
    private var thirdBackgroundLocal by mutableStateOf(thirdBackground)
    private var textColorLocal by mutableStateOf(textColor)
    private var secondTextColorLocal by mutableStateOf(secondTextColor)

    override fun copy() = AppThemeColors(
        this.primary,
        this.secondary,
        this.firstBackground,
        this.secondBackground,
        this.thirdBackground,
        this.textColor,
        this.secondTextColor
    )

    override fun update(other: ThemeColors) {
        primaryLocal = other.primary()
        secondaryLocal = other.secondary()
        firstBackgroundLocal = other.firstBackground()
        secondBackgroundLocal = other.secondBackground()
        thirdBackgroundLocal = other.thirdBackground()
        textColorLocal = other.textColor()
        secondTextColorLocal = other.secondTextColor()
    }


    override fun primary() = primaryLocal

    override fun secondary() = secondaryLocal

    override fun firstBackground() = firstBackgroundLocal

    override fun secondBackground() = secondBackgroundLocal

    override fun thirdBackground() = thirdBackgroundLocal

    override fun textColor() = textColorLocal

    override fun secondTextColor() = secondTextColorLocal


}