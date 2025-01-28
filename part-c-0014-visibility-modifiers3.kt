fun main() {
    
    val upper = UpperManagers()
    
    // internal
    
    println(upper.upperProverb) // A rolling stone gathers no moss!
    
//     println(upper.monthlyPremium) // 200000
    
//     //println(upper.secretPartner) // Cannot access 'secretPartner': it is private in 'UpperManagers'
    
//     println(upper.getSecretPartner()) // Mustafa Büyükdereli


}


class UpperManagers {
    
    internal var upperProverb = "A rolling stone gathers no moss!"
    
    public var monthlyPremium: Int = 200000
    
    private var secretPartner: String = "Mustafa Büyükdereli"
    
    // get!
    
    fun getSecretPartner(): String {
        
        return secretPartner
    }
}
