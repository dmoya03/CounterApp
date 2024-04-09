package com.example.counterlivedatamvvm

import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    private val counter = Counter()

    // Exponer LiveData del contador
    val contadorLiveData = counter.contadorLiveData

    fun incrementarContador() {
        counter.incrementarContador()
    }
}
