plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    id("kotlin-kapt")
}

android {
    namespace = "com.example.data_impl"
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
    
    // Modules
    implementation(project(":data_api"))
    implementation(project(":domain_models"))

    // Core AndroidX
    implementation(libs.androidx.core.ktx)
    implementation(libs.kotlinx.coroutines.android)
   // implementation (libs.javax.inject)
    implementation ("javax.inject:javax.inject:1")

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





    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}