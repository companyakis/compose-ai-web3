fun main() {
    
    var a = 11 // mutable value
    
    println("a = $a")
   
   	a = 101
    
	println("a = $a")
    
    val b = 212 // constant-immutable value
    
    println("b = $b")
    
    //b = 2234 // Error => Val cannot be reassigned

}

// a = 11
// a = 101
// b = 212
