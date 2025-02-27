fun main() {

    val a: Int = 21

    val b: Int = 5

    val years = Array<Int>(3){0}
    
    try {

        println("$a / $b = ${a / b}")

        years[12] = 1990

    } catch (e: Exception) {

        if (e is ArithmeticException) {

            println("Zero division error!")
        }

        if (e is ArrayIndexOutOfBoundsException) {

            println("Consider array length! ${years.size}")
        }

    }

}
