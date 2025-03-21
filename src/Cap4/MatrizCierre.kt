package my.program.Cap4

fun main(){
    val a = Array(3) { i -> i * 2 } // creates an Array<Int> of size 3 containing [0, 2, 4]
    a[0] = 10
    a[1] = 20
    a[2] = 30

    for (element in a) {
        println(element)
    }
}