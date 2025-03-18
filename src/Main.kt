@file:JvmName("MyApp")
package my.program

class App {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            App().run()
        }
    }
    fun run() {
        println("Hello World!!!")
    }
}