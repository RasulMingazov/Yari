package com.jeanbernad.yari.presentation.floating.multi

import androidx.compose.animation.core.Transition
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Row
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.FloatingActionButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.scale
import androidx.compose.ui.unit.dp

@Composable
fun InnerFloatingButton(
    item: InnerFloatingButtonItem,
    stateTransition: Transition<Boolean>,
    collapseParent: () -> Unit
) {
    val alpha: Float by stateTransition.animateFloat(
        label = "Inner button alpha animation",
        transitionSpec = { tween(durationMillis = 50) }
    ) { state -> if (!state) 1f else 0f }

    val scale: Float by stateTransition.animateFloat(
        label = "Inner button scale animation",
    ) { state -> if (!state) 1.0f else 0f }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .alpha(animateFloatAsState(targetValue = alpha).value)
            .scale(animateFloatAsState(targetValue = scale).value)
    ) {
        FloatingActionButton(
            backgroundColor = item.backgroundColor,
            onClick = {
                item.onInnerButtonClicked()
                collapseParent()
            },
            elevation = FloatingActionButtonDefaults.elevation(
                defaultElevation = 4.dp,
                pressedElevation = 6.dp
            )
        ) {
            Icon(
                imageVector = item.icon,
                contentDescription = item.label,
                tint = item.tintColor
            )
        }
    }
}