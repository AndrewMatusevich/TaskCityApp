plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    id("kotlin-kapt")
}

android {
    namespace = "com.example.taskcityappapp.achievements_api"
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

    // Core AndroidX
    implementation(libs.androidx.core.ktx)
    // Dagger
    implementation(libs.dagger)
    kapt(libs.dagger.compiler)

    // i have a feature_api module in compose project with dagger and i want to pass

    //implementation("androidx.navigation:navigation-compose:2.8.9")
    //implementation("androidx.navigation:navigation-runtime-ktx:2.8.9")
//
  ////  implementation(libs.androidx.navigation.runtime.ktx)
    //implementation (libs.compose.runtime) // compose runtime
    //implementation(libs.androidx.compose.compiler)
    ////androidTestImplementation(libs.androidx.test.ext.junit)
//
    //implementation(libs.androidx.core.ktx)
    //implementation(libs.androidx.appcompat)
    //implementation(libs.material)
    //testImplementation(libs.junit)
    //androidTestImplementation(libs.junit)
    //androidTestImplementation(libs.androidx.junit)
    //androidTestImplementation(libs.androidx.espresso.core)
}