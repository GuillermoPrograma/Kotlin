package EjercicioRepaso2

class Perro(val raza : String, override val nombre: String, override val edad: Int) : Mascota(nombre,edad) {

    fun MostrarRaza()
    {
        println("la raza es $raza")
    }

    override fun toString(): String {
        return "Perro(raza='$raza', nombre='$nombre', edad=$edad)"
    }



}