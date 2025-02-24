fun main() {
    
    val numbers = listOf(100, 150, 150, 200, 100, 100, 200)

    val numbersSet = numbers.toHashSet()
    
    println(numbersSet.size) // 3
    
    numbersSet.forEach() {
        println(it)
    }
    
// 100
// 150
// 200

}
