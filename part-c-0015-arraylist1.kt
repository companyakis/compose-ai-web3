fun main() {
    
    val years = arrayListOf(2022, 2023, 1997, 2024)
    
    println(years[0])
    
    println(years.first())
    
    println(years.last())
    
    println("Array length: ${years.size}")
    
    // update element
    
    years[2] = 1990
    
    println(years)
    
    // remove element
    
    years.remove(2023)
    
    println(years)
    
    // for loop 
    
    for (year in years) {
        
        println("Year: ${year}")
    }

}

// 2022
// 2022
// 2024
// Array length: 4
// [2022, 2023, 1990, 2024]
// [2022, 1990, 2024]
// Year: 2022
// Year: 1990
// Year: 2024
