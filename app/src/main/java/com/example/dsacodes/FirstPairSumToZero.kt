package com.example.dsacodes


//7. Find the first pair of array elements having sum equal to zero.

fun findFirstZeroSumPair(arr: IntArray) {
    for (i in arr.indices) {
        for (j in i + 1 until arr.size) {
            if (arr[i] + arr[j] == 0) {
                println("First zero-sum pair: (${arr[i]}, ${arr[j]})")
                return
            }
        }
    }
    println("No pair found with sum 0")
}

fun main() {
    val arr = intArrayOf(3, 2, 4, -2, 5, -1, 1, 4)

    findFirstZeroSumPair(arr)
}