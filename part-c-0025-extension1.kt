fun main() {

    val result1 = 3.multAndAddOne(7)

    println("Result 1: $result1") 

    val result2 = 11.multAndAddOne(15)

    println("Result 2: $result2")

}

// f(x) = n * x + 1

// this -> Int class

fun Int.multAndAddOne(x: Int) : Int {

    return this * x + 1
}

// Result 1: 22
// Result 2: 166
