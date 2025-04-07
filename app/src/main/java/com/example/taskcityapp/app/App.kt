package com.example.taskcityapp.app

import android.app.Application
import com.example.taskcityapp.di.AppDiProvider
import com.example.taskcityapp.di.DaggerAppComponent

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        initDagger()
    }

    private fun initDagger(){
        AppDiProvider.appComponent = DaggerAppComponent
                .builder()
                .addContext(this)
                .build()
    }
}