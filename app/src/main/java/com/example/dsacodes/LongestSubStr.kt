package com.example.dsacodes

fun main() {
    val array = arrayOf("flow", "flower", "flour")
    val res = longestSubstring(array)
    println(res)
}

fun longestSubstring(array: Array<String>): String {
    if (array.isEmpty()) {
        return ""
    }

    var prefix = array[0]

    for (i in 1 until array.size) {
        while (!array[i].startsWith(prefix)) {
            prefix = prefix.dropLast(1)
            if (prefix.isEmpty()) {
                return ""
            }
        }
    }
    return prefix
}