fun main() {

    val classAUsage = A()

    println(classAUsage.sum(12, 45))

    println(classAUsage.proverb)
    
}

interface Calculations {

    val x: Int
    val y: Int

    fun sum(a: Int, b: Int) : Int

    fun say(): String
}

interface Proverbs {
    val proverb: String
}

class A: Calculations, Proverbs {

    override val x: Int = 100
    override val y: Int = 200

    override val proverb: String = "A rolling stone gathers no moss!"

    override fun sum(a: Int, b: Int): Int {
        return a + b
    }

    override fun say(): String {
        return "We like calculus!"
    }



}
