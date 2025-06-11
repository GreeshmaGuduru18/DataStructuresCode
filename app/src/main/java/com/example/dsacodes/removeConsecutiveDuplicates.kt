package com.example.dsacodes

fun removeConsecutiveDuplicates(input: String): String {
    if (input.isEmpty()) return ""

    val result = StringBuilder()
    var prevChar = input[0]
    result.append(prevChar)

    for (i in 1 until input.length) {
        val currentChar = input[i]
        if (currentChar != prevChar) {
            result.append(currentChar)
            prevChar = currentChar
        }
    }

    return result.toString()
}

fun main() {
    val input = "ssuuppperrrrr coooommpuuuuuuuuttttter"
    val output = removeConsecutiveDuplicates(input)
    println(output) // Output: super computer
}