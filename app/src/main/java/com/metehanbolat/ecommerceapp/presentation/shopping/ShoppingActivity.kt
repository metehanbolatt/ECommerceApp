package com.metehanbolat.ecommerceapp.presentation.shopping

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.metehanbolat.ecommerceapp.databinding.ActivityShoppingBinding

class ShoppingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityShoppingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShoppingBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}