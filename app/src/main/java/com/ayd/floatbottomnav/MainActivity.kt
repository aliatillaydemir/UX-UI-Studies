package com.ayd.floatbottomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ayd.floatbottomnav.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavView.background = null //ignore the shadow
        binding.bottomNavView.menu.getItem(2).isEnabled = false //ignore holderPlace

    }
}