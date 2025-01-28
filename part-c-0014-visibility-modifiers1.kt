// public vs private

fun main() {
    
    val upper = UpperManagers()
    
    println(upper.monthlyPremium) // 200000
    
    println(upper.secretPartner) // Cannot access 'secretPartner': it is private in 'UpperManagers'


}

class UpperManagers {
    
    public var monthlyPremium: Int = 200000
    
    private var secretPartner: String = "Mustafa Büyükdereli"
}

