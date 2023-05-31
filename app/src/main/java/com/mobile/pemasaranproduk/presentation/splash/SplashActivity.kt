package com.mobile.pemasaranproduk.presentation.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.mobile.pemasaranproduk.R
import com.mobile.pemasaranproduk.presentation.login.LoginActivity
import com.mobile.pemasaranproduk.utils.startActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        delayAndGoToLogin()
    }

    private fun delayAndGoToLogin() {
        Handler(Looper.getMainLooper()).postDelayed(
            {
            startActivity<LoginActivity>()
                finish()
            },2000
        )
    }
}