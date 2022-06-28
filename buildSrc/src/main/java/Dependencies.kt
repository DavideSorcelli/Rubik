object Deps {
    val core by lazy { "androidx.core:core-ktx:${Versions.ktxCore}" }
    val composeUi by lazy { "androidx.compose.ui:ui:${Versions.compose}" }
    val composeUiToolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview:${Versions.compose}" }
    val composeMaterial3 by lazy { "androidx.compose.material3:material3:${Versions.material3}" }
    val lifecycleRuntime by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}" }
    val lifecycleViewModelCompose by lazy { "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.lifecycle}" }
    val activityCompose by lazy { "androidx.activity:activity-compose:${Versions.activityCompose}" }
    val navigationCompose by lazy { "androidx.navigation:navigation-compose:${Versions.navigationCompose}" }
    val hiltNavigationCompose by lazy { "androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigationCompose}" }
    val hiltAndroid by lazy { "com.google.dagger:hilt-android:${Versions.hiltAndroid}" }
}

object KaptDeps {
    val hiltCompiler by lazy { "com.google.dagger:hilt-compiler:${Versions.hiltAndroid}" }
}

object TestDeps {
    val junit by lazy { "junit:junit:${Versions.junit}" }
}

object BuildDeps {
    val hiltAndroidGradlePlugin by lazy { "com.google.dagger:hilt-android-gradle-plugin:${Versions.hiltAndroid}" }
}

object AndroidTestDeps {
    val androidJunit by lazy { "androidx.test.ext:junit:${Versions.androidJunit}" }
    val espressoCore by lazy { "androidx.test.espresso:espresso-core:${Versions.espresso}" }
    val composeUiJUnit4 by lazy { "androidx.compose.ui:ui-test-junit4:${Versions.compose}" }
    val composeUiTooling by lazy { "androidx.compose.ui:ui-tooling:${Versions.compose}" }
    val composeUiManifest by lazy { "androidx.compose.ui:ui-test-manifest:${Versions.compose}" }
}