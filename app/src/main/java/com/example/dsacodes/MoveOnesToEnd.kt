package com.example.dsacodes

fun moveOnesToEnd(arr: IntArray) {
    var index = 0

    for (i in arr.indices) {
        if (arr[i] != 1) {
            arr[index] = arr[i]
            index++
        }
    }

    // Second pass: fill the rest with 1s
    while (index < arr.size) {
        arr[index] = 1
        index++
    }
}

fun main() {
    val arr = intArrayOf(0, 1, 3, 1, 1, 2, 4)
    moveOnesToEnd(arr)
    println(arr.joinToString())
}
