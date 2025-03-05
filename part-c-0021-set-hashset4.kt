fun main() {

    val names = HashSet<String>()

    names.addAll(listOf("Mustafa", "Mustafa", "Aygün", "Bilge", "Kültigin", "Bengü", "Merve"))

    for ((i, name) in names.withIndex()) {

        println("Name${i + 1} : $name")
    }

    println(names.elementAt(1))
    
}

// Name1 : Bilge
// Name2 : Bengü
// Name3 : Mustafa
// Name4 : Kültigin
// Name5 : Merve
// Name6 : Aygün
// Bengü


