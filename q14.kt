// Prime numbers from 1 to N

fun main() {
    print("Enter N: ")
    val n = readLine()!!.toInt()

    for (i in 2..n) {
        var prime = true

        for (j in 2 until i) {
            if (i % j == 0) {
                prime = false
                break
            }
        }

        if (prime)
            print("$i ")
    }
}
