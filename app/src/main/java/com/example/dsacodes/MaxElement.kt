package com.example.dsacodes

fun findMaximum(arr: IntArray): Int {
    var max = arr[0]

    for (i in 1 until arr.size) {
        if (arr[i] > max) {
            max = arr[i]
        }
    }

    return max
}

fun main() {
    val numbers = intArrayOf(11, 43, 22, 24,56, 45, 33)
    val maxElement = findMaximum(numbers)
    println("Maximum element: $maxElement")
}