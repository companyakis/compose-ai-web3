fun main() {
    
    val salariesByID = HashMap<Int, Int>()
     
	salariesByID.put(101, 5500)
    
    salariesByID.put(124, 6510)
    
    salariesByID.put(135, 4800)
    
    for ((id, salary) in salariesByID) {
        
        println("Employee ID and salary: $id => $salary")
    }
    
}

// Employee ID and salary: 101 => 5500
// Employee ID and salary: 135 => 4800
// Employee ID and salary: 124 => 6510
