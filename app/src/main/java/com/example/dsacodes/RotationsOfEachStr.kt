package com.example.dsacodes

fun areRotations(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) return false

    val combined = str1 + str1
    return isSubstring(combined, str2)
}


fun isSubstring(mainStr: String, subStr: String): Boolean {
    val n = mainStr.length
    val m = subStr.length

    for (i in 0..n - m) {
        var match = true
        for (j in 0 until m) {
            if (mainStr[i + j] != subStr[j]) {
                match = false
                break
            }
        }
        if (match) return true
    }
    return false
}
fun main() {
    val str1 = "abcd"
    val str2 = "cdab"

    if (areRotations(str1, str2)) {
        println("Yes, '$str2' is a rotation of '$str1'")
    } else {
        println("No, '$str2' is NOT a rotation of '$str1'")
    }

}