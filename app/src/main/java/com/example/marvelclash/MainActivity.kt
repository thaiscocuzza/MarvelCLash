package com.example.marvelclash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_splash)

        val logo = findViewById<ImageView>(R.id.logo)
        mostrarTelaLogin()
    }

    private fun mostrarTelaLogin() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}