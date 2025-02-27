fun main() {

    val a: Int = 21

    val b: Int = 0

    try {

        println("$a / $b = ${a / b}")

    } catch (e: Exception) {
      
        println("Error: $e")
    }

}
