package my.program.Cap5

fun main(){
    var condition1 = true
    var condition2 = true

    fun doSomething() {
        println("Doing something...")
        condition1 = false
        condition2 = false
    }

    while(true) {
        if(condition1) {
            continue
        }
        if(condition2) {
            break
        }
    }

    //Si tiene bucles anidados, puede etiquetar las sentencias de bucle y calificar las sentencias de interrupción y continuación para especificar qué bucle desea continuar o dividir:
    outer@ for(i in 0..10) {
        inner@ for(j in 0..10) {
            break // Will break the inner loop
            break@inner // Will break the inner loop
            break@outer // Will break the outer loop
        }
    }
}