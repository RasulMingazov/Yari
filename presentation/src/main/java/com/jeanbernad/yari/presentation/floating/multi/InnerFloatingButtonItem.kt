package com.jeanbernad.yari.presentation.floating.multi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

data class InnerFloatingButtonItem(
    val icon: ImageVector,
    val label: String,
    val tintColor: Color,
    val backgroundColor: Color,
    val onInnerButtonClicked: () -> Unit
)