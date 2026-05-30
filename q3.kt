// Sum of numbers from 1 to N

fun main() {
    print("Enter N: ")
    val n = readLine()!!.toInt()

    var sum = 0

    for (i in 1..n) {
        sum += i
    }

    println("Sum = $sum")
}
