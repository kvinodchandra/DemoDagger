package com.hopeitservice.demodagger.prectic.retrofit

import com.hopeitservice.demodagger.prectic.model.Product
import retrofit2.Response
import retrofit2.http.GET

interface RetrofitApi {
    @GET("products")
    suspend fun getProduct(): Response<List<Product>>
}