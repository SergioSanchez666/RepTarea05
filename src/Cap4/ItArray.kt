package my.program.Cap4

fun main(){
    val asc = Array(5, { i -> (i * i).toString() })
    for(s : String in asc){
        println(s);
    }

    val oth = Array(5, { i -> (i * i).toString() })
    for(s in asc){
        println(s);
    }
}