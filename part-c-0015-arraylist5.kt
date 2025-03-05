fun main() {

    val langs = ArrayList<String>()

    langs.add("Kotlin")

    langs.addAll(arrayOf("Rust", "Python", "Solidity"))

    langs.add(0, "OpShin")

    println(langs.contains("C#"))

    val reversedLangs = langs.reverse()

    println(reversedLangs)

    val sortedLangs = langs.sort()

    println(sortedLangs)

    for ((i, l) in langs.withIndex()) {

        println("Lang${i + 1} : $l")
    }

    langs.removeAt(langs.size - 1)

    println(langs)

    langs.clear()

    println(langs)

}

// false
// [Solidity, Python, Rust, Kotlin, OpShin]
// [Kotlin, OpShin, Python, Rust, Solidity]
// Lang1 : Kotlin
// Lang2 : OpShin
// Lang3 : Python
// Lang4 : Rust
// Lang5 : Solidity
// [Kotlin, OpShin, Python, Rust]
// []

