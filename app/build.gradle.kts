import com.android.build.gradle.internal.cxx.configure.gradleLocalProperties

@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id("kotlin-parcelize")
    id("kotlin-kapt")
}

android {
    namespace = "com.example.taskcityapp"
    compileSdk = libs.versions.compileSdk.get().toInt() // 35

    defaultConfig {
        applicationId = "com.example.taskcityapp"
        minSdk = libs.versions.minSdk.get().toInt() // 26
        targetSdk = libs.versions.targetSdk.get().toInt() // 35
        versionCode = libs.versions.versionCode.get().toInt() // 1
        versionName = libs.versions.versionName.get() // "1.0"
        //android.buildFeatures.buildConfig = true

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_19
        targetCompatibility = JavaVersion.VERSION_19
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_19.toString()
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    // Modules
    implementation(project(":core:ui"))
    implementation(project(":core:navigation"))
    implementation(project(":data_api"))
    implementation(project(":data_impl"))
    implementation(project(":domain_models"))
    // Feature modules
    implementation(project(":features:achievements_api"))
    implementation(project(":features:achievements_impl"))
    implementation(project(":features:city_api"))
    implementation(project(":features:city_impl"))
    implementation(project(":features:settings_api"))
    implementation(project(":features:settings_impl"))
    implementation(project(":features:tasks_api"))
    implementation(project(":features:tasks_impl"))
    // Retrofit
    implementation(libs.retrofit)
    implementation(libs.retrofit.converter.json)
    implementation (libs.adapter.rxjava2)
    implementation (libs.converter.moshi)
    // OkHttp
    implementation(libs.okhttp3.interceptor)
    // Moshi
    implementation (libs.moshi)
    implementation (libs.moshi.kotlin)
    //kapt(libs.moshi.kotlin.codegen)
    kapt("com.squareup.moshi:moshi-kotlin-codegen:1.15.2")

    // Core AndroidX
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation ("javax.inject:javax.inject:1")
    // Compose
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    // Navigation
    implementation(libs.navigation.compose)
    implementation(libs.androidx.navigation.runtime.ktx)
    // Dagger
    implementation(libs.dagger)
    kapt(libs.dagger.compiler)
    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}