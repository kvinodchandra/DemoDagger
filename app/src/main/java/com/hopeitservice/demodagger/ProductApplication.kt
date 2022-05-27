package com.hopeitservice.demodagger

import android.app.Application
import com.hopeitservice.demodagger.prectic.di.ApplicationComponent
import com.hopeitservice.demodagger.prectic.di.DaggerApplicationComponent

class ProductApplication: Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.builder().build()
    }
}