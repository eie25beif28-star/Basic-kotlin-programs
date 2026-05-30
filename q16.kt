// Temperature Conversion

fun main() {

    print("Enter Celsius: ")
    val c = readLine()!!.toDouble()

    val f = (c * 9 / 5) + 32

    println("Fahrenheit = $f")

    print("Enter Fahrenheit: ")
    val fahrenheit = readLine()!!.toDouble()

    val celsius = (fahrenheit - 32) * 5 / 9

    println("Celsius = $celsius")
}
