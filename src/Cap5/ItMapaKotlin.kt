package my.program.Cap5

fun main(){
    //iterates over a map, getting the key and value at once
    var map = hashMapOf(1 to "foo", 2 to "bar", 3 to "baz")
    for ((key, value) in map) {
        println("Map[$key] = $value")
    }
}