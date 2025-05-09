package ar.unpsb.ing.pm.primerosviewmodelsapp.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ar.unpsb.ing.pm.primerosviewmodelsapp.domain.GenerarSaludoUseCase

class MainActivityViewModel : ViewModel() {

    private val generarSaludoUseCase = GenerarSaludoUseCase()

    val saludo: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    fun alCambiarNombre(name: String){
        this.saludo.value = generarSaludoUseCase.execute(name)
    }

}