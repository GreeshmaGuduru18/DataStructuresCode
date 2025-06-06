package com.example.dsacodes

fun areAllAnagrams(words: List<String>): Boolean {
    if (words.isEmpty()) return true

    val sorted = words[0].toCharArray().sorted()
    for (word in words) {
        if (word.toCharArray().sorted() != sorted) {
            return false
        }
    }
    return true
}

fun main() {
    val words = listOf("listen", "silent", "enlist")
    if (areAllAnagrams(words)) {
        println("All strings are anagrams.")
    } else {
        println("Strings are not all anagrams.")
    }
}