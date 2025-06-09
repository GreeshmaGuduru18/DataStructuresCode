package com.example.dsacodes

fun reverseEachWord(input: String): String {
    return input.split(" ")
        .joinToString(" ") { it.reversed() }
}


fun main() {
    val sentence = "Android is best"

    val reversedWords = reverseEachWord(sentence)
    println("Reversed Words: $reversedWords")
}