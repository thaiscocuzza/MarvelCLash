package com.example.marvelclash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initView()
    }

    private fun initView() {

        val email = findViewById<EditText>(R.id.texto_email)
        val senha = findViewById<EditText>(R.id.texto_senha)
        val botaoEntrar = findViewById<Button>(R.id.botao_entrar)
        val botaoFacebook = findViewById<Button>(R.id.botao_facebook)
        val botaoGoogle = findViewById<Button>(R.id.botao_google)
        val botaoEsqueceuSenha = findViewById<Button>(R.id.botao_esqueceusenha)
        val botaoCadastro = findViewById<Button>(R.id.botao_cadastrar)

//        mudar a MainActivity
        botaoEntrar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        //        mudar a MainActivity
        botaoFacebook.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

//        mudar a MainActivity
        botaoGoogle.setOnClickListener {
            val intent = Intent(this, MainActivity :: class.java)
            startActivity(intent)
        }

        //        mudar a MainActivity
        botaoEsqueceuSenha.setOnClickListener {
            val intent = Intent(this, MainActivity :: class.java)
            startActivity(intent)
        }

        //        mudar a MainActivity
        botaoCadastro.setOnClickListener {
            val intent = Intent(this, CadastroActivity :: class.java)
            startActivity(intent)
        }
    }

}