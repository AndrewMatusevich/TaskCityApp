plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id("kotlin-kapt")
}

android {
    namespace = "com.example.taskcityappapp.tasks_impl"
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
}

dependencies {

    //implementation(project(":core:navigation"))
    //implementation(project(":core:ui"))
    //implementation(project(":data_api"))
    //implementation(project(":domain_models"))
    implementation(project(":features:tasks_api"))

    //implementation("androidx.navigation:navigation-compose:2.8.9")
    //implementation("androidx.navigation:navigation-runtime-ktx:2.8.9")

    // Core AndroidX
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    // Compose
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
    // Dagger
    implementation(libs.dagger)
    kapt(libs.dagger.compiler)

    //// ui compose
    //implementation (libs.compose.runtime) // compose runtime
    //implementation(libs.androidx.compose.compiler)
    //implementation(libs.activity.compose)
    //implementation(platform(libs.compose.bom))
    //implementation(libs.androidx.ui)
    //implementation(libs.ui.graphics)
    //implementation(libs.ui.tooling.preview)
//
    //implementation(libs.material3)
 // //  implementation(libs.compose.navigation)
  ////  implementation(libs.androidx.navigation.runtime.ktx)
    //implementation(libs.lifecycle.runtime.compose)
    //implementation(libs.kotlinx.collections.immutable)
    //implementation(libs.kotlinx.coroutines.android)
    //implementation(libs.lifecycle.viewmodel.ktx)
    //implementation(libs.coil.compose)
    //androidTestImplementation(platform(libs.compose.bom))
    //androidTestImplementation(libs.ui.test.junit4)
    //androidTestImplementation(libs.navigation.testing)
    //debugImplementation(libs.ui.tooling)
    //debugImplementation(libs.ui.test.manifest)
//
    //// tests
    //testImplementation(libs.junit)
    //testImplementation(libs.mockk)
    //testImplementation(libs.kotlinx.coroutines.test)
    ////androidTestImplementation(libs.androidx.test.ext.junit)
//
    //implementation (libs.compose.runtime) // compose runtime
    //implementation(libs.androidx.compose.compiler)
//
    //implementation(libs.androidx.core.ktx)
    //implementation(libs.androidx.appcompat)
    //implementation(libs.material)
    //testImplementation(libs.junit)
    //androidTestImplementation(libs.junit)
    //androidTestImplementation(libs.androidx.junit)
    //androidTestImplementation(libs.androidx.espresso.core)
}