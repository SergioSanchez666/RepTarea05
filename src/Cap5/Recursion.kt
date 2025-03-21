package my.program.Cap5

fun main() {
    fun factorial(n: Long): Long = if (n == 0L) 1L else n * factorial(n - 1L)
    println(factorial(10L)) // 3628800
}