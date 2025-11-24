package EjercicioRepaso

class Camiones(override val matricula : String) : Vehiculo(matricula) {
    var remolque : Remolque? =  null
    fun PonerRemolque(r: Remolque)
    {
        remolque = r
    }

    fun QuitarRemolque()
    {
        remolque = null
    }

    override fun toString(): String {
        return "Camiones(remolque=$remolque,matricula='$matricula', velocidad = $velocidad, remolque=$remolque)"
    }

}