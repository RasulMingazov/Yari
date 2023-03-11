package com.jeanbernad.yari.presentation.stub

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.jeanbernad.yari.presentation.R

@Composable
fun EmptyScreen(
    @StringRes title: Int = R.string.empty_title,
    @StringRes message: Int = R.string.try_again
) {
    StubScreen(
        icon = painterResource(id = R.drawable.illustration_document),
        title = stringResource(id = title),
        message = stringResource(id = message)
    )
}