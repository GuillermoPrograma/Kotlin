package EjercicioRepaso

 class Coches(val numeroDePuertas: Int, override val matricula : String) : Vehiculo(matricula)
{
    override fun Acelerar(incremento: Int) {
        super.Acelerar(incremento)
    }

    override fun toString(): String {
        return "Coches(numeroDePuertas=$numeroDePuertas, matricula='$matricula', velocidad = $velocidad)"
    }


}