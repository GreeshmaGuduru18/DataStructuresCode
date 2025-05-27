package com.example.dsacodes

//4.  Time Complexity: O(n) , Space Complexity: O(1)
fun firstUniqueChar(s: String): Int {
    val count = IntArray(26)

    for (ch in s) {
        count[ch - 'a']++
    }
    for (i in s.indices) {
        if (count[s[i] - 'a'] == 1) {
            return i
        }
    }
    return -1
}

fun main(){
    println(firstUniqueChar("leetcode"))
    println(firstUniqueChar("loveleetcode"))
    println(firstUniqueChar("aabb"))
}