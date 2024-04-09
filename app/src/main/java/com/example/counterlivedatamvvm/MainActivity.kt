package com.example.counterlivedatamvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var counterViewModel: CounterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counterViewModel = ViewModelProvider(this).get(CounterViewModel::class.java)

        val textViewCounter = findViewById<TextView>(R.id.textViewCounter)
        val buttonIncrement = findViewById<Button>(R.id.buttonIncrement)

        // Observar el cambio en el contador y actualizar la interfaz de usuario
        counterViewModel.contadorLiveData.observe(this, { contador ->
            textViewCounter.text = "Contador: $contador"
        })

        // Incrementar el contador cada vez que se presiona el botón
        buttonIncrement.setOnClickListener {
            counterViewModel.incrementarContador()
        }
    }
}
