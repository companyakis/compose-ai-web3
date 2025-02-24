fun main() {
    
    val cities = HashSet<String>()
    
    cities.addAll(listOf("izmir", "ankara", "izmir", "istanbul", "kahramanmaraş", "elazığ", "izmir"))
    
    cities.forEach{
        
        println(it)
    }
    
}

// ankara
// izmir
// istanbul
// elazığ
// kahramanmaraş
