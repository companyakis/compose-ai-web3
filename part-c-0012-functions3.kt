fun main() {
    
    val x = 3
    val y = 4
    val z = 5 
    
    var calculation = calculator(x, y, z)
    
    println(calculation) // (60, 12)
    
    var (multiplication, sum) = calculation
    
    println("Multiplication result : $multiplication") // Multiplication result : 60
    
    println("Sum result : $sum") // Sum result : 12
      
}

fun calculator(a: Int, b: Int, c: Int) : Pair<Int, Int> {
    
    return Pair(a * b * c, a + b + c)
}

