package com.mobile.pemasaranproduk.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.mobile.pemasaranproduk.R
import com.mobile.pemasaranproduk.databinding.ActivityMainBinding
import com.mobile.pemasaranproduk.presentation.home.HomeFragment
import com.mobile.pemasaranproduk.presentation.myads.MyAdsFragment
import com.mobile.pemasaranproduk.presentation.user.UserFragment
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initBottomNav()
    }

    override fun onBackPressed() {
        val itemId = binding.btmNavMain.selectedItemId
        if (itemId == R.id.action_home){
            finish()
        } else{
        openHomeFragment()
        }
    }

    private fun initBottomNav() {
        binding.btmNavMain.setOnItemSelectedListener {
            when(it.itemId){
                R.id.action_home -> {
                    openFragment(HomeFragment())
                    return@setOnItemSelectedListener true
                }

                R.id.action_sell -> {

                }

                R.id.action_my_ads -> {
                    openFragment(MyAdsFragment())
                    return@setOnItemSelectedListener true
                }

                R.id.action_user -> {
                    openFragment(UserFragment())
                    return@setOnItemSelectedListener true
                }
            }
            return@setOnItemSelectedListener false
        }
        openHomeFragment()
    }

    private fun openHomeFragment() {
        binding.btmNavMain.selectedItemId = R.id.action_home
    }

    private fun openFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame_main, fragment)
            .addToBackStack(null)
            .commit()
    }
}