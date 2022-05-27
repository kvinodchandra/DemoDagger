package com.hopeitservice.demodagger.prectic.di

import com.hopeitservice.demodagger.prectic.MainActivity
import com.hopeitservice.demodagger.prectic.retrofit.RetrofitServices
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RetrofitServices::class])
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)
}