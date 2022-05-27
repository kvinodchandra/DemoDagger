package com.hopeitservice.demodagger.prectic

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.hopeitservice.demodagger.ProductApplication
import com.hopeitservice.demodagger.R
import com.hopeitservice.demodagger.prectic.viewModel.MainModelFactory
import com.hopeitservice.demodagger.prectic.viewModel.ProductViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    lateinit var productViewModel: ProductViewModel

    @Inject
    lateinit var mainModelFactory: MainModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var tvTitle: TextView = findViewById(R.id.tv_title)

//        val retrofitAPI = RetrofitServices.getInstance()
//        val productRepository = ProductRepository(RetrofitServices.getApi(retrofitAPI))
//        productViewModel = ViewModelProvider(this, MainModelFactory(productRepository)).get(ProductViewModel::class.java)

        (application as ProductApplication).applicationComponent.inject(this)

        productViewModel = ViewModelProvider(this, mainModelFactory).get(ProductViewModel::class.java)

        //same
        productViewModel.getProduct()

        productViewModel.productList.observe(this, Observer {
            Log.e("productList", it.toString())
            tvTitle.text = it.joinToString { it.title+"\n\n" }
        })
    }
}