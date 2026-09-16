package com.example.ex4

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random
import android.util.Log

class MainActivity : AppCompatActivity() {

    var contador = 0

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
    fun rolarDado(view: View) {

        // Aumenta o contador de rolagens
        contador++

        // Sorteia um número de 1 até 6
        val resultado = Random.nextInt(1, 7)

        // Mostra as duas informações no TextView
        val textoResultado = findViewById<TextView>(R.id.resultado)

        textoResultado.text = "Rolagem $contador: resultado $resultado"

        // Registra a rolagem no Logcat
        Log.d("DADO", "Rolagem $contador: resultado $resultado")
    }
}