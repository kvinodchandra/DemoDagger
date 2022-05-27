package com.hopeitservice.demodagger.dagger

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class UserRegisterService @Inject constructor(
    @Named("sql") private val userRepository: UserRepository,
    @MessageQualifier private val notificationService: NotificationService
) {

    fun registerUser(email:String, password:String){
        Log.e("registerUser", "Loading...")

        userRepository.saveUser(email, password)
        notificationService.sendMail(email, "noreplay@gmail.com", "User register")
    }
}