plugins {
    id(Plugins.androidApplication)
    id(Plugins.kotlinAndroid)
    id(Plugins.kotlinKapt)
    id(Plugins.hiltAndroid)
}

android {
    compileSdk = Config.compileSdk

    defaultConfig {
        applicationId = Config.applicationId
        minSdk = Config.minSdk
        targetSdk = Config.targetSdk
        versionCode = Config.versionCode
        versionName = Config.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Versions.compose
    }

    packagingOptions {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }

}

dependencies {
    implementation(Deps.core)
    implementation(Deps.composeUi)
    implementation(Deps.composeUiToolingPreview)
    implementation(Deps.composeMaterial3)
    implementation(Deps.lifecycleRuntime)
    implementation(Deps.lifecycleViewModelCompose)
    implementation(Deps.activityCompose)
    implementation(Deps.navigationCompose)
    implementation(Deps.hiltNavigationCompose)
    implementation(Deps.hiltAndroid)

    kapt(KaptDeps.hiltCompiler)

    testImplementation(TestDeps.junit)
    androidTestImplementation(AndroidTestDeps.androidJunit)
    androidTestImplementation(AndroidTestDeps.espressoCore)
    androidTestImplementation(AndroidTestDeps.composeUiJUnit4)
    debugImplementation(AndroidTestDeps.composeUiTooling)
    debugImplementation(AndroidTestDeps.composeUiManifest)
}