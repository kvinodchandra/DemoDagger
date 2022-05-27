package com.hopeitservice.demodagger.dagger

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface NotificationService{
    fun sendMail(to:String, from:String, body:String)
}

@Singleton
class EmailServices @Inject constructor(): NotificationService {
    override fun sendMail(to:String, from:String, body:String){
        Log.e("EmailServices", "Mail Send")
    }
}

class MessageServices @Inject constructor(): NotificationService {
    override fun sendMail(to:String, from:String, body:String){
        Log.e("MessageServices", "Message Send")
    }
}