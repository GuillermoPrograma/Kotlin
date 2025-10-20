package Ejercicio4

data class Recordatorio(override val descripcion :  String, override val prioridad : Int, override val disponible : Boolean , val hora : String) : Tarea(descripcion, prioridad, disponible)
