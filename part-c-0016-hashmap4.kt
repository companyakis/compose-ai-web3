fun main() {

    val namesAndAges = HashMap<String, Int>()

    namesAndAges.put("Aykan", 24)
    namesAndAges.put("Bengü", 54)
    namesAndAges.put("Aybilge", 43)
    namesAndAges.put("Hakan", 60)

    println(namesAndAges) // {Bengü=54, Hakan=60, Aykan=24, Aybilge=43}

    // update

    namesAndAges["Hakan"] = 65

    println(namesAndAges) // {Bengü=54, Hakan=65, Aykan=24, Aybilge=43}

    println(namesAndAges.size)

    for ((key, value) in namesAndAges) {
        println("Name: $key - age: $value")
    }

    namesAndAges.remove("Hakan")

    namesAndAges.clear()
}




