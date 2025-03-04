fun main() {

    val userName: String? = null

    lateinit var city: String

    println("User name: $userName")

    city = "Ankara"

    println("User city: $city")

    // lateinit can't be used with primitive types, such as Int...

}

// User name: null
// User city: Ankara

