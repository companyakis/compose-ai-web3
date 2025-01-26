fun main() {
    
    val point = 57 
    
    when (point) {
        
        in 90..100 -> println("Awesome")
        
        in 60..89 -> println("Normal")
        
        else -> println("Be careful!")
    }
    
}


