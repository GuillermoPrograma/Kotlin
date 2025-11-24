package EjercicioRepaso

import kotlin.random.Random

 abstract class Vehiculo(open val matricula:String)
{

    var  velocidad = (50..120).random()

    open fun Acelerar( incremento : Int)
    {
        if(velocidad+incremento <= 120)
        velocidad += incremento;
    }
    open fun mostrarDatos()
    {
        println("Matricula: $matricula")
        println("Velocidad: $velocidad")
    }

}