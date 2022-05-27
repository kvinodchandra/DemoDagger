package com.hopeitservice.demodagger.prectic.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.hopeitservice.demodagger.prectic.model.Product
import com.hopeitservice.demodagger.prectic.retrofit.RetrofitApi
import javax.inject.Inject

// without dagger
//class ProductRepository(private val api: RetrofitApi) {
//    private val productList = MutableLiveData<List<Product>>()
//
//    val productRes:LiveData<List<Product>>
//    get() = productList
//
//    suspend fun getProductList(){
//        val result = api.getProduct()
//
//        if (result.body() != null){
//            productList.postValue(result.body())
//        }
//    }
//
//}

class ProductRepository @Inject constructor(private val api: RetrofitApi) {

    private val productList = MutableLiveData<List<Product>>()
    val productRes:LiveData<List<Product>>
    get() = productList

    suspend fun getProductList(){
        val result = api.getProduct()

        if (result.body() != null){
            productList.postValue(result.body())
        }
    }
}