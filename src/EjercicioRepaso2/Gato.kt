package EjercicioRepaso2

import kotlin.random.Random
import kotlin.random.nextInt

class Gato(nombre: String, edad: Int, perezaInicial: Int) : Mascota(nombre,edad) {
    var nivelPereza = perezaInicial

        get() = field
        set(value) {
            when
            {
                value > 10 -> 10
                value < 0 -> 0
                else-> value
            }

        }

    override fun toString(): String {
        return "Gato(nivelPereza=$nivelPereza, nombre='$nombre', edad=$edad)"
    }
    fun  dormir()
    {
        if(nivelPereza < 10)
            nivelPereza += 1
    }
    fun jugar()
    {
        if(nivelPereza > 0 && peso > 3)
        {
            nivelPereza -= 2
            if(nivelPereza < 0)
                nivelPereza = 0
        }
    }
}