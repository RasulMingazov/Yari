import com.jeanbernad.yari.buildsrc.Dependencies

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.jeanbernad.theme"
    compileSdk = 33

    defaultConfig {
        minSdk = 24
        targetSdk = 33

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {

        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.2.0"
    }
}

dependencies {
    implementation(Dependencies.Core.coreKtx)
    implementation(Dependencies.Core.lifecycle)
    implementation(Dependencies.Compose.activity)
    implementation(Dependencies.Compose.ui)
    implementation(Dependencies.Compose.preview)
    implementation(Dependencies.Compose.navigation)
    implementation(Dependencies.Android.material)
    implementation(Dependencies.Android.material)
    implementation(Dependencies.Android.splash)
    testImplementation(Dependencies.Test.jUnit)
    androidTestImplementation(Dependencies.Test.extJUnit)
    androidTestImplementation(Dependencies.Test.composeTestManifest)
    debugImplementation(Dependencies.Compose.debug)
    androidTestImplementation(Dependencies.Test.composeUiTest)
}