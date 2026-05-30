// Swap numbers

fun main() {

    var a = 10
    var b = 20

    println("Using Third Variable")
    var temp = a
    a = b
    b = temp

    println("a = $a")
    println("b = $b")

    a = 10
    b = 20

    println("Without Third Variable")

    a = a + b
    b = a - b
    a = a - b

    println("a = $a")
    println("b = $b")
}
