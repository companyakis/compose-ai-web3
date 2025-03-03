fun main() {

    val emp_ayhan = Employee("Ayhan Bilir", "HR", "Expert", 65000)

    emp_ayhan.summary() // Employee info => name: Ayhan Bilir - department: HR - title: Expert - salary: 65000


}

class Employee(var name: String, var department: String, var title: String, var salary: Int) {

    fun summary() {

        println("Employee info => name: $name - department: $department - title: $title - salary: $salary") 
    }

}



