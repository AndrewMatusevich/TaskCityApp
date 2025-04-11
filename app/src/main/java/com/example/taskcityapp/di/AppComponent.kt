package com.example.taskcityapp.di

import android.content.Context
import com.example.taskcityapp.presentation.main.MainActivity
import dagger.BindsInstance
import dagger.Component


@Component(
    modules = [
        AppModule::class,
        FeatureModule::class,
        RepositoryModule::class,
        NetworkModule::class
    ]
)
interface AppComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder{
    @BindsInstance
        fun addContext(context: Context): Builder
        fun build(): AppComponent
    }
}