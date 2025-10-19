package Ejercicio4

data class Recordatorio(override val descripcion :  String, override val prioridad : Int, override val disponible : Boolean , val dia : Int) : Tarea(descripcion, prioridad, disponible)
