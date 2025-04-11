pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
       // maven { url = uri("https://api.mapbox.com/downloads/v2/releases/maven") } // Mapbox Maven Repository
    }
}

rootProject.name = "TaskCityApp"
include(":app")
include(":core:ui")
include(":core:navigation")
include(":data_api")
include(":data_impl")
include(":domain_models")
include(":features:city_api")
include(":features:city_impl")
include(":features:tasks_api")
include(":features:tasks_impl")
include(":features:achievements_api")
include(":features:achievements_impl")
include(":features:settings_api")
include(":features:settings_impl")
