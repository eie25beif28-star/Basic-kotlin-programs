// Count digits in a number

fun main() {
    print("Enter a number: ")
    var num = readLine()!!.toInt()

    var count = 0

    while (num != 0) {
        count++
        num /= 10
    }

    println("Digits = $count")
}
