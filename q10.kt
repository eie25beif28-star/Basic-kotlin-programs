// Check vowel or consonant

fun main() {
    print("Enter a character: ")
    val ch = readLine()!![0]

    if (ch.lowercaseChar() in listOf('a', 'e', 'i', 'o', 'u'))
        println("Vowel")
    else
        println("Consonant")
}
