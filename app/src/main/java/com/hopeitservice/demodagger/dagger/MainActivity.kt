package com.hopeitservice.demodagger.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hopeitservice.demodagger.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegisterService: UserRegisterService

    @Inject
    lateinit var emailServices: EmailServices

    @Inject
    lateinit var emailServices1: EmailServices

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        //Manual Dependency enjection
//        val userRepository = UserRepository()
//        val emailServices = EmailServices()
//
//        val userRegisterService = UserRegisterService(userRepository, emailServices)

        //with dagger
//        val userRegisterService = DaggerUserRegisterComponent.builder().build().getUserRegisterService()
        DaggerUserRegisterComponent.builder().build().anyName(this)
        userRegisterService.registerUser("email@gmail.co.in", "password")
    }
}