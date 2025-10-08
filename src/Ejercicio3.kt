fun main() {

   var i : Int = 0;
    var contAprobs : Int = 0;
    var contSusp : Int = 0;


    while (i < 10)
    {

    var nota = readln()?.toIntOrNull();
    i++;
        if(nota == null)
     {
    println("Dato no valido")
     }
        else {
            if (nota >= 7) {
                contAprobs++;
            } else {
                contSusp++;
            }
        }
    }
    println("Contador aprobados :" + contAprobs + " Contador Suspensos : " + contSusp)
}