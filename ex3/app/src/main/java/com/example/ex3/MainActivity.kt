package com.example.ex3

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

        fun sortear(view: View) {

            val numero = (1..100).random()

            val resultado = findViewById<TextView>(R.id.resultado)

            resultado.text = numero.toString()

            if (numero % 2 == 0) {
                Log.d("SORTEIO", "número par sorteado: $numero")
            } else {
                Log.d("SORTEIO", "número ímpar sorteado: $numero")
            }
        }

}