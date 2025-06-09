package com.example.dsacodes

fun findLongestWordManual(input: String): String {
    var maxLen = 0
    var longestWord = ""
    var word = ""

    for (i in input.indices) {
        val c = input[i]
        if (c != ' ') {
            word += c
        } else {
            if (word.length > maxLen) {
                maxLen = word.length
                longestWord = word
            }
            word = ""
        }
    }

    if (word.length > maxLen) {
        longestWord = word
    }

    return longestWord
}


fun main() {
    val input = "Android is best"

    val longest = findLongestWordManual(input)
    println("Longest Word: $longest")
}
