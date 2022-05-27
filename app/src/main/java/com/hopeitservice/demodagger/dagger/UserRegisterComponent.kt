package com.hopeitservice.demodagger.dagger

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [UserRepositryModules::class, NotificationModules::class])
interface UserRegisterComponent {
    //fun getUserRegisterService() : UserRegisterService

    fun anyName(mainActivity: MainActivity)

}