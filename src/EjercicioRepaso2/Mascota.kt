package EjercicioRepaso2

import kotlin.random.Random

abstract class Mascota(open val nombre: String, open val edad: Int) {
    var peso = Random.nextDouble(1.0, 20.0 + 1)

    open fun mostrarInfo()
    {
    println("nombre: $nombre")
        println("edad: $edad")
        println("peso: $peso")
    }

    open fun Alimentar(cantidad : Double)
    {
        peso += cantidad
    }



}

