package com.example.dsacodes

fun isPalindrome(str: String): Boolean {
    val n = str.length
    for (i in 0 until n / 2) {
        if (str[i] != str[n - i - 1]) {
            return false
        }
    }
    return true
}

fun main() {
    val input = "madam"
    if (isPalindrome(input)) {
        println("$input is a palindrome.")
    } else {
        println("$input is not a palindrome.")
    }
}