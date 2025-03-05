fun main() {

    val emp1 = Employee("Aykan Alıcı", 4296, "Sales", 57000)
    val emp2 = Employee("Kağan Gökada", 3254, "Marketing", 62500)
    val emp3 = Employee("Bengü Bilir", 6578, "Accounting", 48000)

    val empList = ArrayList<Employee>()

    empList.addAll(arrayOf(emp1, emp2, emp3))

    for (emp in empList.sortedWith(compareByDescending { it.salary })) {

        println("${emp.name} - ${emp.id} - ${emp.department} - ${emp.salary}")
    }

}

data class Employee(var name: String, var id: Int, var department: String, var salary: Int) {

}

// Kağan Gökada - 3254 - Marketing - 62500
// Aykan Alıcı - 4296 - Sales - 57000
// Bengü Bilir - 6578 - Accounting - 48000
