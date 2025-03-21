package my.program.Cap4

fun main(){
    val a = arrayOfNulls<Int>(3) // creates an Array<Int?> of [null, null, null]
    a[0] = 10
    a[1] = 20
    a[2] = 30

    for (element in a) {
        println(element)
    }
}