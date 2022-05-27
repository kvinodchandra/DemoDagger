package com.hopeitservice.demodagger.dagger

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class UserRepositryModules {

    @Named("sql")
    @Provides
    fun saveUserSQL(sqlRepository: SQLRepository): UserRepository {
        return sqlRepository
    }

    @Named("firebase")
    @Provides
    fun saveUserFirebase(firebaseRepository: FirebaseRepository): UserRepository {
        return firebaseRepository
    }
//    @Binds
//    abstract fun saveUser(sqlRepository: FirebaseRepository): UserRepository
}