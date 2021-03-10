package com.example.marvelclash

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_login)

        initViews()

    }

    private fun initViews() {

        val email = findViewById<EditText>(R.id.texto_email)
        val senha = findViewById<EditText>(R.id.texto_nome)
        val botao_entrar = findViewById<Button>(R.id.botao_entrar)
        val botao_esqueceusenha = findViewById<Button>(R.id.botao_esqueceusenha)
        val botao_facebook = findViewById<Button>(R.id.botao_facebook)
        val botao_google = findViewById<Button>(R.id.botao_google)
        val botao_cadastro = findViewById<Button>(R.id.botao_cadastrar)

        botao_entrar.setOnClickListener {
            Toast.makeText(this," Que bom que voltou!", Toast.LENGTH_LONG)
                    .show()
            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)
        }

        botao_cadastro.setOnClickListener {
            Toast.makeText(this," Vamos lá!", Toast.LENGTH_LONG)
                    .show()
            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)
        }

        botao_facebook.setOnClickListener {
            Toast.makeText(this," Vamos lá!", Toast.LENGTH_LONG)
                    .show()
            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)
        }

        botao_google.setOnClickListener {
            Toast.makeText(this," Vamos lá!", Toast.LENGTH_LONG)
                    .show()
            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)
        }
    }
}
