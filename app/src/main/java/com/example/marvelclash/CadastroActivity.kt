package com.example.marvelclash

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CadastroActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_cadastro)
    }

    private fun initViews() {

        val nome = findViewById<EditText>(R.id.texto_nome)
        val email = findViewById<EditText>(R.id.texto_email)
        val senha = findViewById<EditText>(R.id.texto_nome)
        val botao_cadastrar = findViewById<Button>(R.id.botao_cadastrar)

        botao_cadastrar.setOnClickListener {
            Toast.makeText(this," Bem vindo!", Toast.LENGTH_LONG)
                    .show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}

