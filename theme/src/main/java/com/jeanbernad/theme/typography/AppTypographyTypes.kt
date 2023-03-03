package com.jeanbernad.theme.typography

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.jeanbernad.theme.R

class AppTypographyTypes : TypographyTypes {

    override fun default() = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )

    override fun appbar() = TextStyle(
        fontFamily = FontFamily(Font(R.font.manuka_medium)),
        fontSize = 32.sp
    )
}