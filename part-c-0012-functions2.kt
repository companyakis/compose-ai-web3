fun main() {
    
    val x = 3
    val y = 4
    val z = 5 
    
    println("$x * $y * $z = ${multiplication(x, y, z)}")
    
}

fun multiplication(a: Int, b: Int, c: Int) : Int {
    
    return a * b * c
}

