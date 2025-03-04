fun main() {

    // static

    println(Employee.company) // Company Akis

    Employee.printCurrentYear() // 2025
    
    //val man = Manager()
    //man.managerSays() // A rolling stone gathers no moss!

    // virtual object

    Manager().managerSays() // A rolling stone gathers no moss!

}

class Employee {

    companion object {

        val company= "Company Akis"

        fun printCurrentYear() {

            println("2025")
        }
    }


}

class Manager {

    fun managerSays() {

        println("A rolling stone gathers no moss!")
    }


}



