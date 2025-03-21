package my.program.Cap4

fun main(){
    val a = arrayOf(1, 2, 3) // creates an Array<Int> of size 3 containing [1, 2, 3].
    a[0] = 10
    a[1] = 20
    a[2] = 30

    for (element in a) {
        println(element)
    }
}