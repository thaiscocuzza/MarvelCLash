package com.example.marvelclash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        initViews()
    }

    fun initViews() {
        val botaoCadastrar = findViewById<Button>(R.id.botao_cadastrar)
        val nome = findViewById<EditText>(R.id.texto_nome)
        val email = findViewById<EditText>(R.id.texto_email)
        val senha = findViewById<EditText>(R.id.texto_senha)

        botaoCadastrar.setOnClickListener {
            val intent = Intent(this, MainActivity ::class.java)
            startActivity(intent)
        }
    }
}