package com.mobile.pemasaranproduk.presentation.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.mobile.pemasaranproduk.databinding.ActivityRegisterBinding
import com.mobile.pemasaranproduk.utils.toast

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initActionBar()
        onAction()
    }

    private fun onAction() {
        binding.btnRegister.setOnClickListener { toast("Register")}

        binding.tbRegister.setNavigationOnClickListener { onBackPressed() }
    }

    private fun initActionBar(){
        setSupportActionBar(binding.tbRegister)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = ""
    }
}