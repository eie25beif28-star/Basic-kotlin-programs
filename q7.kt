// Largest among three numbers

fun main() {
    print("Enter first number: ")
    val a = readLine()!!.toInt()

    print("Enter second number: ")
    val b = readLine()!!.toInt()

    print("Enter third number: ")
    val c = readLine()!!.toInt()

    println("Largest = ${maxOf(a, b, c)}")
}
