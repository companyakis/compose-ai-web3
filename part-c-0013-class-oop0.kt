fun main() {

    val emp_ayhan = Employee("Ayhan Bilir", "HR", "Expert", 65000)

    println(emp_ayhan.name)

    emp_ayhan.department = "Sales"

    println(emp_ayhan.department)

}

class Employee(var name: String, var department: String, var title: String, var salary: Int) {

}



