fun main() {
    
    val emp_ayhan = Employee()
    
    emp_ayhan.name = "Ayhan Bilici"
    emp_ayhan.department = "Sales"
    emp_ayhan.id = "4296"
    emp_ayhan.salary = 45000
    
    emp_ayhan.print_emp_info() // Ayhan Bilici - Sales - 4296 - 45000
     
    
}

class Employee {
    
    var name: String = ""
    var department: String = ""
    var id: String = ""
    var salary: Int = 0
    
    fun print_emp_info() {
        
        println("$name - $department - $id - $salary")
    }
    
}

