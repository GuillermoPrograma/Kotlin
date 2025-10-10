package Ejercicio4

import kotlin.io.readln

class GestorTareas {

val listaTareas: MutableList <Tarea> = mutableListOf();

    fun MeterTarea()
    {
        println("Descripcion : ");
        var descripcion : String = readln().toString();
        println("Prioridad :")
        var prioridad : Int = readln().toInt();
        println("Disponible :")
        var disponible : Boolean = readln().toBoolean();

    listaTareas.add(Tarea(descripcion,prioridad,disponible));
    }
    fun EliminoTarea()
    {
        println("Prioridad de Tarea que deseas eliminar")
        var prioridad : Int = readln().toInt();
        val tareaAEliminar = listaTareas.find { it.prioridad == prioridad }


    }
}