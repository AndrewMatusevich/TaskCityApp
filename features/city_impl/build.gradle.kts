plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id("kotlin-kapt")
}

android {
    namespace = "com.example.taskcityapp.city_impl"
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
    implementation(project(":data_api"))
    implementation(project(":domain_models"))
    implementation(project(":features:city_api"))


    // Core AndroidX
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation (libs.androidx.runtime.livedata)
    // Compose
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.animation)
    implementation (libs.androidx.runtime)
    // StateFlow, Kotlin coroutines
    implementation (libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.coroutines.core)
    // Accompanist for additional UI components
    implementation (libs.accompanist.insets)
    // Navigation
    implementation(libs.navigation.compose)
    implementation(libs.androidx.navigation.runtime.ktx)
    // Dagger
    implementation(libs.dagger)
    kapt(libs.dagger.compiler)
    // Inject
    implementation("com.squareup.inject:assisted-inject-annotations-dagger2:0.8.1")
    kapt("com.squareup.inject:assisted-inject-processor-dagger2:0.8.1")
    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}