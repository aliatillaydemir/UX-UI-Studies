package com.example.onboardingscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.NoActionBarStyle)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}