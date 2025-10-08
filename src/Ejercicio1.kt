

    fun main() {

        var num1 : Double = 0.0;
        num1 = readln().toDouble();

        val num2: Double = readln().toDouble();

        val num3: Double = readln().toDouble();

        val num4: Double =readln().toDouble();
        val media: Double = (num1 + num2 + num3 + num4)/ 4

        if(num1 == null|| num2 == null || num3 == null || num4 == null)
        {
            println("No valido")
        }
        else {
            println("$media")

            if (media > 5) {
                println("aproado")
            } else {
                println("suspendido")
            }
        }
    }

