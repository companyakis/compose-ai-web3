fun main() {
    
    var calculations = Calculator()
    
    println(calculations.sum(2, 3)) // 5
    
    println(calculations.sum(10, 13, 9)) // 32
    
    println(calculations.sum(12, 33, 21, 17)) // 83

}


class Calculator {
    
    fun sum(a: Int, b: Int): Int {
        
        return a + b
    }
    
    fun sum(a: Int, b: Int, c: Int): Int {
        
        return a + b + c
    }
    
    fun sum(a: Int, b: Int, c: Int, d: Int): Int {
        
        return a + b + c + d
    }      
      
}
