package com.hopeitservice.demodagger.prectic.retrofit

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

//without dagger
//class RetrofitServices {
//
//    companion object{
//        val BASE_URL = "https://fakestoreapi.com/"
//
//        fun getInstance():Retrofit{
//            return Retrofit.Builder()
//                .baseUrl(BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build()
//        }
//
//        fun getApi(retrofit: Retrofit) : RetrofitApi{
//            return retrofit.create(RetrofitApi::class.java)
//        }
//    }
//}

//with dagger
// RetrofitServiceModule--->Dagger Name when using dagger

@Module
class RetrofitServices {

    val BASE_URL = "https://fakestoreapi.com/"

    @Singleton
    @Provides
    fun getInstance():Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun getApi(retrofit: Retrofit) : RetrofitApi{
        return retrofit.create(RetrofitApi::class.java)
    }
}