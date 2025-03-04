fun main() {

    val cal = Calculator()

    cal.sum(321, 454)

    cal.sum(12.23, 45.32, 654.21)

    cal.sum(34.34, 35.35)

    cal.sum(321, 454, 9999)
    
}

class Calculator {

    fun sum(x: Int, y: Int) {

        println("$x + $y = ${x + y}")
    }

    fun sum(x: Double, y: Double) {

        println("$x + $y = ${x + y}")
    }

    fun sum(x: Double, y: Double, z: Double) {

        println("$x + $y + $z = ${x + y + z}")
    }

    fun sum(x: Int, y: Int, z: Int) {

        println("$x + $y + $z = ${x + y + z}")
    }

}


/*
321 + 454 = 775
12.23 + 45.32 + 654.21 = 711.76
34.34 + 35.35 = 69.69
321 + 454 + 9999 = 10774
*/
