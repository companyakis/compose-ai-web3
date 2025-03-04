fun main() {

    val human = Human()
    val turkic = Turk()
    val english = English()

    human.speak()
    turkic.speak()
    english.speak()
}

open class Human {
    open fun speak() {
        println("Which language should I speak?")
    }
}

class Turk: Human() {
    override fun speak() {
        println("I can speak Turkic language")
    }
}

class English: Human() {
    override fun speak() {
        println("I can speak English")
    }
}

// Which language should I speak?
// I can speak Turkic language
// I can speak English











