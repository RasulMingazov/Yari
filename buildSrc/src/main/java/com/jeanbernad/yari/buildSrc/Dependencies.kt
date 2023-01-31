package com.jeanbernad.yari.buildsrc

object Dependencies {

    object Core {
        const val coreKtx = "androidx.core:core-ktx:${Versions.Core.ktx}"
        const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.Core.lifecycle}"
    }

    object Compose {
        const val activity = "androidx.activity:activity-compose:${Versions.Compose.activity}"
        const val ui = "androidx.compose.ui:ui:${Versions.Compose.composeUiVersion}"
        const val preview = "androidx.compose.ui:ui-tooling-preview:${Versions.Compose.composeUiVersion}"
        const val debug = "androidx.compose.ui:ui-tooling:${Versions.Compose.composeUiVersion}"

    }

    object Android {
        const val material = "androidx.compose.material:material:${Versions.Android.material}"
    }

    object Test {
        const val jUnit = "junit:junit:${Versions.Test.jUnit}"
        const val extJUnit = "androidx.test.ext:junit:${Versions.Test.extJUnit}"
        const val composeTestManifest = "androidx.compose.ui:ui-test-manifest:${Versions.Compose.composeUiVersion}"
        const val composeUiTest = "androidx.compose.ui:ui-test-junit4:${Versions.Compose.composeUiVersion}"
    }
}