fun main() {

    val employeeAyhan = Employee("Ayhan Bilir", "4298", 57000, "Sales")

    val empHakan = Employee("Hakan Göktürk", "6587", 65000, "HR")

    println("Employee: ${employeeAyhan.empName}")
    println("Employee ID: ${employeeAyhan.ID}")
    println("Employee salary: ${employeeAyhan.salary} ₺")
    println("Employee department: ${employeeAyhan.departmentName}")

}

open class Department(var departmentName: String) {

}

class Employee(var empName: String, var ID: String, var salary: Int,  departmentName: String) : Department(departmentName) {

}


// Employee: Ayhan Bilir
// Employee ID: 4298
// Employee salary: 57000 ₺
// Employee department: Sales







