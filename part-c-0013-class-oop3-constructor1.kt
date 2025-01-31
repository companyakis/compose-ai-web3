fun main() {
    
    val emp_ayhan = Employee("Ayhan Bilici", 75000) // Ayhan Bilici => 75000
    
}

class Employee(val name: String, val salary: Int) {
    
    init {
        
        println("$name => $salary")
    }
}



    
