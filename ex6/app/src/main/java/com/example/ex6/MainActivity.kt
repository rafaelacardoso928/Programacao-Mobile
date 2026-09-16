package com.example.ex6

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

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

        val textoResultado = findViewById<TextView>(R.id.resultado)

        val numero = Random.nextInt(0, 11)

        textoResultado.text = "Número sorteado: $numero"

        if (numero % 2 == 0) {

            textoResultado.setTextColor(Color.BLUE)

            Log.d("SORTEIO", "Número par sorteado: $numero - cor aplicada: AZUL")

        } else {

            textoResultado.setTextColor(Color.RED)

            Log.d("SORTEIO", "Número ímpar sorteado: $numero - cor aplicada: VERMELHO")
        }
    }
}