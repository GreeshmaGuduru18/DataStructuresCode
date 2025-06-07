package com.example.dsacodes

fun removeCommonCharacters(str1: String, str2: String): String {
    val charsToRemove = str2.toSet()
    val result = str1.filter { it !in charsToRemove }
    return result
}

fun main() {
    val str1 = "kotlin"
    val str2 = "logic"
    val result = removeCommonCharacters(str1, str2)
    println("Result after removal: $result")
}