fun main() {

    val manager_Mustafa = Managers("121", "Mustafa Büyükdereli")

    val dep_fintech = Departments("8", "FinTech")

    val em_aygun = Employee("Aygün Kaplan", 57000, dep_fintech, manager_Mustafa)

    println("Employee name: ${em_aygun.employeeName}")
    println("Employee salary: ${em_aygun.salary}")
    println("Employee department: ${em_aygun.department.departmentName}")
    println("Employee manager: ${em_aygun.manager.managerName}")
    
}

data class Managers(var managerID: String, var managerName: String) {

}

data class Departments(var departmentID: String, var departmentName: String) {

}

data class Employee(var employeeName: String, var salary: Int, var department: Departments, var manager: Managers) {

}

// Employee name: Aygün Kaplan
// Employee salary: 57000
// Employee department: FinTech
// Employee manager: Mustafa Büyükdereli





