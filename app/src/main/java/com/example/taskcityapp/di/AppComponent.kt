package com.example.taskcityapp.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component


@Component(
    modules = [
        AppModule::class,
        FeatureModule::class,
        RepositoryModule::class
    ]
)
interface AppComponent {


    @Component.Builder
    interface Builder{
    @BindsInstance
        fun addContext(context: Context): Builder
        fun build(): AppComponent
    }
}