package com.mobile.pemasaranproduk.presentation.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mobile.pemasaranproduk.R
import com.mobile.pemasaranproduk.databinding.ActivityLoginBinding
import com.mobile.pemasaranproduk.presentation.main.MainActivity
import com.mobile.pemasaranproduk.presentation.register.RegisterActivity
import com.mobile.pemasaranproduk.utils.startActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onAction()
    }

    private fun onAction() {
        binding.btnLogin.setOnClickListener { startActivity<MainActivity>() }

        binding.btnRegisterLogin.setOnClickListener { startActivity<RegisterActivity>() }
    }
}