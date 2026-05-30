// Check palindrome number

fun main() {
    print("Enter a number: ")
    var num = readLine()!!.toInt()

    val original = num
    var reverse = 0

    while (num != 0) {
        reverse = reverse * 10 + num % 10
        num /= 10
    }

    if (original == reverse)
        println("Palindrome")
    else
        println("Not Palindrome")
}
