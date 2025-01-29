fun main() {
    
    var herFinance = FinancialCondition(10000.0, "USD", 4.5, 2.5)
    
    herFinance.earnInterest()
    
    println("Her money now: ${herFinance.initialMoney}") // Her money now: 10450.0
    
    herFinance.payTax()
    
    println("Her money now: ${herFinance.initialMoney}") // Her money now: 10200.0
    
}

class FinancialCondition(var initialMoney: Double, var exchange: String, var interestRate: Double, var taxRate: Double) {
    
    fun earnInterest() {
        
        initialMoney += interestRate * 100.0
    }
    
    fun payTax() {
        
        initialMoney -= taxRate * 100.0
    }
    
}
