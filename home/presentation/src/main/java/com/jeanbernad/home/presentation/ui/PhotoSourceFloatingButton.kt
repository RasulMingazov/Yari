package com.jeanbernad.home.presentation.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import com.jeanbernad.home.presentation.R
import com.jeanbernad.theme.AppTheme
import com.jeanbernad.yari.presentation.floating.MultiFloatingButton
import com.jeanbernad.yari.presentation.floating.multi.InnerFloatingButtonItem

@Composable
fun PhotoSourceFloatingButton(
    cameraSourceClicked: () -> Unit,
    gallerySourceClicked: () -> Unit
) {
    val galleryButton = InnerFloatingButtonItem(
        icon = ImageVector.vectorResource(id = R.drawable.ic_camera),
        label = stringResource(id = R.string.gallery),
        tintColor = AppTheme.colors().secondTextColor(),
        backgroundColor = AppTheme.colors().higher()
    ) { gallerySourceClicked() }

    val cameraButton = InnerFloatingButtonItem(
        icon = ImageVector.vectorResource(id = R.drawable.ic_camera),
        label = stringResource(id = R.string.camera),
        tintColor = AppTheme.colors().secondTextColor(),
        backgroundColor = AppTheme.colors().higher()
    ) { cameraSourceClicked() }

    MultiFloatingButton(
        tintColor = AppTheme.colors().secondTextColor(),
        label = stringResource(id = R.string.photo_selection),
        icon = ImageVector.vectorResource(id = R.drawable.ic_camera),
        backgroundColor = AppTheme.colors().secondary(),
        items = listOf(cameraButton, galleryButton)
    )
}