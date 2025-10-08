fun main() {

    var numero : Int = 0

    while (numero != null && numero <= 99 && numero >= 0) {
        numero = readln().toInt();

        if (numero / 10 < 1) {
            println("Numero Correcto, calculando Numero de Digitos ... ")
            println("Tu numero solo tiene un digito")
        } else {
            println("Numero Correcto, calculando Numero de Digitos ... ")
            println("Tu numero tiene dos digitos")
        }
    }
    print("Número fuera de ranfo, cerramos programa")
}