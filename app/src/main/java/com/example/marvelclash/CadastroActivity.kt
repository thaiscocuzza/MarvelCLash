package com.example.marvelclash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.text.TextUtils
import android.util.Patterns
import android.widget.Button
import android.widget.EditText

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        initViews()
    }

    private fun initViews() {
        val botaoCadastrar = findViewById<Button>(R.id.botao_cadastrar)
        val textoNome = findViewById<EditText>(R.id.texto_nome)
        val textoEmail = findViewById<EditText>(R.id.texto_email)
        val textoSenha = findViewById<EditText>(R.id.texto_senha)

        botaoCadastrar.setOnClickListener {
            val intent = Intent(this, MenuActivity ::class.java)
        }
    }

//    fun validarCampo(){
//        val nome = textoNome.getText().toString()
//        val email =  textoEmail.getText().toString()
//        val senha =  textoSenha.getText().toString()
//
//    }
//    fun campoVazio(valor): Boolean {
//
//        return (TextUtils.isEmpty(valor) || valor.trim().isEmpty())
//    }
//
//    fun emailValido(email) : Boolean{
//        return (!campoVazio(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches())
//    }




}