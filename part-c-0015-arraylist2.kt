fun main() {
    
    val names = ArrayList<String>()
    
	// add one name
    
    names.add("Mustafa")
    
    // add more
    
    names.addAll(listOf("Aygün", "Bilge", "Kültigin", "Bumin", "Kutluk"))
    
    for (name in names) {
        
        println("Name: $name")
    }

}

// Name: Mustafa
// Name: Aygün
// Name: Bilge
// Name: Kültigin
// Name: Bumin
// Name: Kutluk

