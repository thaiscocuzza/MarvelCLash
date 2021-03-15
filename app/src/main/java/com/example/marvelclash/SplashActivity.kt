package com.example.marvelclash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.content.ContextCompat.startActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val handle = Handler()
        handle.postDelayed(Runnable { mostrarSplash() }, 5000)
    }

    private fun mostrarSplash() {
        val intent = Intent(this, LoginActivity :: class.java)
        startActivity(intent)
        finish()
    }
}