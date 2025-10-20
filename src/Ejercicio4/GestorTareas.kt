package Ejercicio4

class GestorTareas {

    val listaTareas: MutableList<Tarea> = mutableListOf();

    fun MeterTarea(descripcion: String, prioridad: Int, disponible: Boolean) {
        listaTareas.add(Tarea(descripcion, prioridad, disponible));
    }

    fun EliminoTarea(prioridad: Int) {

        val iterador = listaTareas.iterator();
        while (iterador.hasNext()) {
            val tarea = iterador.next();
            if (tarea.prioridad == prioridad) {
                iterador.remove();
            }
        }


    }

    fun BuscoTareasPrioridad(prioridad: Int) {
        //val prioridad: Int = readln().toInt();
        // println("Dime la prioridad de las tareas que quieres buscar  :")

        for (tarea in listaTareas) {
            if (tarea.prioridad == prioridad) {
                println(tarea);
            }
        }

    }

    fun BuscoTareasDescripcion(descripcion: String) {
        for (tarea in listaTareas) {
            if (tarea.descripcion == descripcion)
                println(tarea);
        }

    }

    fun BuscoTareasDisponibilidad(disponibilidad: Boolean) {
        for (tarea in listaTareas) {
            if (tarea.disponible == disponibilidad)
                println(tarea);
        }
    }

    fun MostrarTodasTareas() {
        for (tarea in listaTareas)
            println(tarea);
    }
}