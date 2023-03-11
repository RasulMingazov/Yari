package com.jeanbernad.yari.presentation.floating

import androidx.compose.animation.core.Transition
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.FloatingActionButtonDefaults
import androidx.compose.material.FloatingActionButtonElevation
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.jeanbernad.yari.presentation.floating.multi.InnerFloatingButton
import com.jeanbernad.yari.presentation.floating.multi.InnerFloatingButtonItem

@Composable
fun MultiFloatingButton(
    icon: ImageVector,
    label: String,
    tintColor: Color,
    backgroundColor: Color,
    items: List<InnerFloatingButtonItem>,
) {
    val isButtonCollapsed = true
    var multiButtonState by remember { mutableStateOf(isButtonCollapsed) }
    val stateTransition = updateTransition(targetState = multiButtonState, label = "")
    val changeMultiButtonState = { multiButtonState = !stateTransition.currentState }

    Column(horizontalAlignment = Alignment.End) {
        items.forEach { item ->
            InnerFloatingButton(
                item = item,
                stateTransition = stateTransition,
                collapseParent = changeMultiButtonState
            )
            Spacer(modifier = Modifier.height(14.dp))
        }
        FloatingActionButton(
            backgroundColor = backgroundColor,
            onClick = changeMultiButtonState,
            elevation = FloatingActionButtonDefaults.elevation(
                defaultElevation = 4.dp,
                pressedElevation = 6.dp
            )
        ) {
            Icon(
                imageVector = icon,
                contentDescription = label,
                tint = tintColor
            )
        }
    }
}