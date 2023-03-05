import com.jeanbernad.yari.buildsrc.Dependencies

plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.jeanbernad.yari"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.jeanbernad.yari"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

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
    implementation(project(":presentation"))
    implementation(project(":theme"))
    implementation(project(":home:presentation"))

    implementation(Dependencies.Core.coreKtx)
    implementation(Dependencies.Core.lifecycle)

    implementation(Dependencies.Compose.activity)
    implementation(Dependencies.Compose.ui)
    implementation(Dependencies.Compose.preview)

    implementation(Dependencies.Android.material)
    implementation(Dependencies.Android.splash)

    implementation(Dependencies.Voyager.voyager)
    implementation(Dependencies.Voyager.bottom)
    implementation(Dependencies.Voyager.androidX)
    implementation(Dependencies.Voyager.tab)
    implementation(Dependencies.Voyager.transitions)
    implementation(Dependencies.Voyager.viewModel)

    testImplementation(Dependencies.Test.jUnit)
    androidTestImplementation(Dependencies.Test.extJUnit)
    androidTestImplementation(Dependencies.Test.composeTestManifest)
    debugImplementation(Dependencies.Compose.debug)
    androidTestImplementation(Dependencies.Test.composeUiTest)
}