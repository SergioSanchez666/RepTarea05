package my.program.Cap4

import java.util.Arrays

fun main() {
    val empty = emptyArray<String>() // Crea un array vacío de Strings
    var strings = Array(size = 5, init = { index -> "Item #$index" }) // Crea un array de 5 Strings

    print(Arrays.toString(strings)) // Imprime el array como una cadena: [Item #0, Item #1, Item #2, Item #3, Item #4]
    println() // agrega un salto de linea

    print(strings.size) // Imprime el tamaño del array: 5
    println() // agrega un salto de linea

    strings.set(2, "ChangedItem") // Cambia el elemento en el índice 2
    print(strings.get(2)) // Imprime el elemento en el índice 2: ChangedItem
    println() // agrega un salto de linea

    strings[2] = "ChangedItem" // Cambia el elemento en el índice 2 (usando suscripción)
    print(strings[2]) // Imprime el elemento en el índice 2: ChangedItem
}
