fun main() {

    calculatePremium(60000, Staff.EXPERT)

    calculatePremium(70000, Staff.MANAGER)

    calculatePremium(45000, Staff.ASSISTANT)
    
}

enum class Staff {
    MANAGER, EXPERT, ASSISTANT
}

fun calculatePremium(salary: Int, empType: Staff) {

    when(empType) {

        Staff.MANAGER -> println("Manager premium: ${salary * 1.1} ₺")
        Staff.EXPERT -> println("Expert premium : ${salary * 1.1} ₺")
        Staff.ASSISTANT -> println("Assistant premium : ${salary * 1.15} ₺")
    }
}

// Expert premium : 66000.0 ₺
// Manager premium: 77000.0 ₺
// Assistant premium : 51749.99999999999 ₺




