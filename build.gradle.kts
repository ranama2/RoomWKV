// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    id("com.google.devtools.ksp") version "1.9.24-1.0.20" apply false
}

buildscript {
    //ext.kotlin_version = '1.9.24'
    repositories {
        mavenCentral()
        google()
    }
    dependencies {
        classpath (libs.gradle)
        classpath (libs.kotlin.gradle.plugin)
    }
}

allprojects {
    repositories {
        //google()
        //mavenCentral()
    }
}


tasks.register("clean", Delete::class){
    delete(rootProject.buildDir)
}

