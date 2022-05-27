package com.hopeitservice.demodagger.dagger

import android.util.Log
import javax.inject.Inject

interface UserRepository {
    fun saveUser(email:String, password:String)
}

class SQLRepository @Inject constructor(): UserRepository {
    override fun saveUser(email:String, password:String){
        Log.e("UserRepository", "user save SQL")
    }
}

class FirebaseRepository @Inject constructor() : UserRepository {
    override fun saveUser(email:String, password:String){
        Log.e("FirebaseRepository", "user save in firebase")
    }
}