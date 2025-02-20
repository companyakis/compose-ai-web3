fun main() {
    
    var ages = arrayListOf<UByte>()
    
    ages.add(22u)
    ages.add(35u)
    ages.addAll(listOf(12u, 45u, 47u))
    
    println("Last age item: ${ages[ages.size - 1]}") // Last age item: 47
    
    ages.remove(45u)
    
    println(ages[3]) // 47
    
    ages.removeAt(0)

    println(ages[0]) // 35

}

