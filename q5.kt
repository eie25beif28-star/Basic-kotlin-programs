// Factorial of a number

fun main() {
    print("Enter a number: ")
    val n = readLine()!!.toInt()

    var factorial = 1L

    for (i in 1..n) {
        factorial *= i
    }

    println("Factorial = $factorial")
}
