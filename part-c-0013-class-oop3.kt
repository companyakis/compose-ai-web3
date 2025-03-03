fun main() {

    val emp_ayhan = Employee("Ayhan Bilir", "HR", "Expert", 65000)

    emp_ayhan.changeDepartment("Marketing")

    emp_ayhan.salaryIncrease(12)

    emp_ayhan.summary() // Employee info => name: Ayhan Bilir - department: Marketing - title: Expert - salary: 72800

    /*
First worker!
Employee info => name: Ayhan Bilir - department: Marketing - title: Expert - salary: 72800
    */

}

class Employee(var name: String, var department: String, var title: String, var salary: Int) {

    init { // constructor
        println("First worker!")
    }

    fun summary() {

        println("Employee info => name: $name - department: $department - title: $title - salary: $salary")
    }

    fun changeDepartment(newDep: String) {

        department = newDep
    }

    fun salaryIncrease(rate: Int) {

        salary += salary * rate / 100
    }
}



