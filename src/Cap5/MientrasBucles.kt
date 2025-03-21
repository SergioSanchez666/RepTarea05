package my.program.Cap5

fun main() {
    var condition = true

    fun doSomething() {
        println("Doing something...")
        condition = false
    }

    while (condition) {
        doSomething()
    }

    condition = true

    do {
        doSomething()
    } while (condition)
}