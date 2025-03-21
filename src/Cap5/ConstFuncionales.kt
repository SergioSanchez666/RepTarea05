package my.program.Cap5

fun main() {
    val numbers1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    val numberStrings1 = numbers1.map { "Number $it" }

    val numbers2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    val numberStrings2 = numbers2.filter { it % 2 == 0 }.map { "Number $it" }

    println(numberStrings1)
    println(numberStrings2)
}