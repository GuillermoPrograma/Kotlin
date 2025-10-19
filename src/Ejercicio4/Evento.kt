package Ejercicio4

data class Evento( override val descripcion :  String, override val prioridad : Int, override val disponible : Boolean , val dia : Int) : Tarea(descripcion, prioridad, disponible)
