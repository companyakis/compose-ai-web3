fun main() {
    
    val emp_ayhan = Employee("Ayhan Bilici", 75000) // Ayhan Bilici => 75000
    
	  val dep_fintech = Department("Fintech", "Mustafa Büyükdereli") // Department name and head person: Fintech - Mustafa Büyükdereli

    
}

class Employee(val name: String, val salary: Int) {
    
    init {
        
        println("$name => $salary")
    }
}

class Department {
    
    var depName: String = ""
    var depHead: String = ""
    
    constructor(depName: String, depHead: String) {
        
        this.depName = depName
        this.depHead = depHead
        
        println("Department name and head person: $depName - $depHead")
    }
}



    
