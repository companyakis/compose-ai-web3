fun main() {
    
    val namesAges = hashMapOf("Ayhan" to 62, "Mustafa" to 17, "Aygün" to 35)
    
    namesAges["Mustafa"] = 99 
    
    println(namesAges) // {Ayhan=62, Mustafa=99, Aygün=35}
    
    namesAges.remove("Ayhan")
    
    println(namesAges) // {Mustafa=99, Aygün=35}
    
    println(namesAges.size) // 2
    
}

