fun main() {
    
	val aHuman = Human()
    
    aHuman.speak() // A human can speak Turkish, English etc...
    
    val aCat = Cat()
    
    aCat.speak() // A cat can't speak, but it says 'Miyavvvv'
}

open class Human {
    
    open fun speak() {
        
        println("A human can speak Turkish, English etc...")
    }
    
} 

// sub-class

class Cat: Human() {
    
    override fun speak() {
        
        println("A cat can't speak, but it says 'Miyavvvv'")
    }
}






    
