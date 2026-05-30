// Simple Interest

fun main() {
    print("Enter Principal: ")
    val p = readLine()!!.toDouble()

    print("Enter Rate: ")
    val r = readLine()!!.toDouble()

    print("Enter Time: ")
    val t = readLine()!!.toDouble()

    val si = (p * r * t) / 100

    println("Simple Interest = $si")
}
