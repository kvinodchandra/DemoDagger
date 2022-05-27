package com.hopeitservice.demodagger.prectic.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hopeitservice.demodagger.prectic.model.Product
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ProductViewModel(private val repository: ProductRepository): ViewModel() {
    val productList: LiveData<List<Product>>
    get() = repository.productRes

    fun getProduct(){
        viewModelScope.launch(Dispatchers.IO) {
            repository.getProductList()
        }
    }
}