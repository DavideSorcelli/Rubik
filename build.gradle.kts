buildscript {
    dependencies {
        classpath(BuildDeps.hiltAndroidGradlePlugin)
    }
}

plugins {
    id(Plugins.androidApplication) version Versions.gradlePlugin apply false
    id(Plugins.androidLibrary) version Versions.gradlePlugin apply false
    id(Plugins.kotlinAndroid) version Versions.kotlin apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}