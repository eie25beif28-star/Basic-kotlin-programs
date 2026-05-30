// Reverse a number

fun main() {
    print("Enter a number: ")
    var num = readLine()!!.toInt()

    var reverse = 0

    while (num != 0) {
        reverse = reverse * 10 + num % 10
        num /= 10
    }

    println("Reversed Number = $reverse")
}
