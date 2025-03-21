package my.program.Cap5

fun main() {
    val list = listOf("Hello", "World", "!")

    // Iteración simple sobre una lista
    for (str in list) {
        print(str)
    }

    // Iteración sobre un rango de números
    for (i in 0..9) {
        print(i)
    }

    // Iteración con índice sobre una lista
    for ((index, element) in list.withIndex()) {
        println("$element at index $index")
    }

    // Iteración funcional con forEach sobre una lista
    list.forEach {
        println(it)
    }
}