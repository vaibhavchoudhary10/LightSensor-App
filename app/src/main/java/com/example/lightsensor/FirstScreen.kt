package com.example.lightsensor

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FirstScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_first_screen)
        
        supportActionBar?.hide()

        Handler(Looper.getMainLooper()).postDelayed({
            var i  = Intent(this, MainActivity::class.java)
            startActivity(i)
            finish()
        },3000)
    }
}