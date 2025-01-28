fun main() {
    
    val upper = UpperManagers()
    
    println(upper.monthlyPremium) // 200000
    
    //println(upper.secretPartner) // Cannot access 'secretPartner': it is private in 'UpperManagers'
    
    println(upper.getSecretPartner()) // Mustafa Büyükdereli


}


class UpperManagers {
    
    public var monthlyPremium: Int = 200000
    
    private var secretPartner: String = "Mustafa Büyükdereli"
    
    // get!
    
    fun getSecretPartner(): String {
        
        return secretPartner
    }
}
