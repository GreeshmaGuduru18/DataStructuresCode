package com.example.dsacodes

fun firstNonRepeatingChar(str: String): Char? {
    val countMap = mutableMapOf<Char, Int>()

    for (char in str) {
        countMap[char] = countMap.getOrDefault(char, 0) + 1
    }

    for (char in str) {
        if (countMap[char] == 1) {
            return char
        }
    }
    return null
}

fun main() {
    val input = "qawsedrfgxdzswadq"
    val result = firstNonRepeatingChar(input)
    println("First non-repeating character: $result")
}