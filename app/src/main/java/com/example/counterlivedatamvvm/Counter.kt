package com.example.counterlivedatamvvm

import androidx.lifecycle.MutableLiveData

class Counter {
    // LiveData mutable para el contador
    val contadorLiveData = MutableLiveData<Int>()

    init {
        contadorLiveData.value = 0
    }

    fun incrementarContador() {
        val contadorActual = contadorLiveData.value ?: 0
        contadorLiveData.value = contadorActual + 1
    }
}
