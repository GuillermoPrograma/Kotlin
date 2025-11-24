package EjercicioRepaso

import Ejercicio4.Tarea

fun main() {

    val listaVehiculos: MutableList<Vehiculo> = mutableListOf();

    val coche1 = Coches(4,"Matricula12")
    val coche2 = Coches(3,"Matricula23")
    listaVehiculos.add(coche1)
    listaVehiculos.add(coche2)

    val camion1 = Camiones("MatriculaCamion12")
    val camion2 = Camiones("MatriculaCamion23")
    listaVehiculos.add(camion1)
    listaVehiculos.add(camion2)

    for (v in listaVehiculos) {
      println(v.toString())
    }

    val remolque1 = Remolque(5000,15000.0)
    camion1.PonerRemolque(remolque1)
    camion2.PonerRemolque(remolque1)

    for (v in listaVehiculos) {
        println(v.toString())
    }
}