package my.program

class Comp {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            Comp().run()
        }
    }
    fun run() {
        println("Hello World!!!")
    }
}