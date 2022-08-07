package com.metehanbolat.ecommerceapp.presentation.loginregister

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.metehanbolat.ecommerceapp.R
import com.metehanbolat.ecommerceapp.databinding.ActivityLoginRegisterBinding

class LoginRegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginRegisterBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}