package ar.unpsb.ing.pm.primerosviewmodelsapp.domain

class GenerarSaludoUseCase {


    fun execute(name: String) : String {

        return "Hola, $name"
    }
}