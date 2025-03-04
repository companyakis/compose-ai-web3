fun main() {

    val salesDepartment = Department("Sales")

    val employeeAyhan = Employee("Ayhan Bilir", "4298", 57000, salesDepartment.departmentName)

    println("Employee: ${employeeAyhan.empName}")
    println("Employee ID: ${employeeAyhan.ID}")
    println("Employee salary: ${employeeAyhan.salary} ₺")
    println("Employee department: ${employeeAyhan.departmentName}")

}

// super
open class Department(var departmentName: String) { 

}

//sub
class Employee(var empName: String, var ID: String, var salary: Int,  departmentName: String) : Department(departmentName) {

}

// Employee: Ayhan Bilir
// Employee ID: 4298
// Employee salary: 57000 ₺
// Employee department: Sales







