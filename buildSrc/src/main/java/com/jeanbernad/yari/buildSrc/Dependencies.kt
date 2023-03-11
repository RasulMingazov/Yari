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
        const val navigation = "androidx.navigation:navigation-compose:${Versions.Compose.navigation}"
    }

    object Android {
        const val material = "androidx.compose.material:material:${Versions.Android.material}"
        const val material3 = "androidx.compose.material3:material3:${Versions.Android.material3}"
        const val splash = "androidx.core:core-splashscreen:${Versions.Android.splash}"
        const val animation = "androidx.compose.animation:animation-core:${Versions.Android.animation}"
    }

    object Test {
        const val jUnit = "junit:junit:${Versions.Test.jUnit}"
        const val extJUnit = "androidx.test.ext:junit:${Versions.Test.extJUnit}"
        const val composeTestManifest = "androidx.compose.ui:ui-test-manifest:${Versions.Compose.composeUiVersion}"
        const val composeUiTest = "androidx.compose.ui:ui-test-junit4:${Versions.Compose.composeUiVersion}"
    }

    object Voyager {
        const val voyager = "cafe.adriel.voyager:voyager-navigator:${Versions.Voyager.voyager}"
        const val bottom = "cafe.adriel.voyager:voyager-bottom-sheet-navigator:${Versions.Voyager.voyager}"
        const val androidX = "cafe.adriel.voyager:voyager-androidx:${Versions.Voyager.voyager}"
        const val tab = "cafe.adriel.voyager:voyager-tab-navigator:${Versions.Voyager.voyager}"
        const val transitions = "cafe.adriel.voyager:voyager-transitions:${Versions.Voyager.voyager}"
        const val viewModel = "cafe.adriel.voyager:voyager-androidx:${Versions.Voyager.voyager}"
    }
}