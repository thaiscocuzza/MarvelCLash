package com.example.marvelclash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val logo = findViewById<ImageView>(R.id.logo)
        val handle = Handler()
        handle.postDelayed(Runnable { mostrarSplash() }, 5000)
    }

    private fun mostrarSplash() {
        val intent = Intent(this, LoginActivity :: class.java)
        startActivity(intent);
        finish();
    }
}