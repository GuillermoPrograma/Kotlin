package Ejercicio4

import kotlin.Int

fun main() {

    val gestor1 = GestorTareas();

    var bucle : Boolean = true;
    while (bucle == true)
    {
        println("Menu : ")
        println("""
            1: Crear Tarea
            2: Eliminar Tarea por Prioridad
            3: Buscar tarea por Prioridad
            4: Buscar tarea por Descripcion
            5: Buscar tarea por Disponibilidad
            6: Mostrar tareas
            7: Salir programa """.trimIndent()
            )
      var numElegido = readln().toIntOrNull() ?: -1;

        when(numElegido)
        {
            1 ->  {println("Descripcion : ");
                val descripcion: String = readln().toString();
                println("Prioridad :")
                val prioridad: Int = readln().toInt();
                println("Disponible :")
                val disponible: Boolean = readln().toBoolean();
                println("1-Evento 2-Recordatorio")
                val numElegir = readln().toInt();
                when(numElegir)
                {
                    1-> {val día: Int = readln().toInt();
                    }
                }


                gestor1.MeterTarea(descripcion,prioridad,disponible);}

            2->{ println("Prioridad de Tarea que deseas eliminar")
                val prioridad: Int = readln().toInt();
                gestor1.EliminoTarea(prioridad)}
            3->{ println("Dime la prioridad de las tareas que quieres buscar :")
                val prioridad: Int = readln().toInt();
                gestor1.BuscoTareasPrioridad(prioridad)}
            4->{ println("Dime la descripcion de la tareas que quieres buscar :")
                val descripcion: String = readln().toString();
                gestor1.BuscoTareasDescripcion(descripcion);
            }
            5->{ println("Dime la disponibilidad de la tarea que buscar")
                val disponible: Boolean = readln().toBoolean();
                gestor1.BuscoTareasDisponibilidad(disponible);
            }
            6->{ println("Mostrando Tareas")
                gestor1.MostrarTodasTareas();
            }
            7->{ println("Saliendo Del Programa")
                bucle = false
            }
            else -> println("Error")
        }

    }

}