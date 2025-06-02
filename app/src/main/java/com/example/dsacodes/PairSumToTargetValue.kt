package com.example.dsacodes

fun findAllPairsWithSum(arr: IntArray, target: Int) {
    var found = false
    for (i in arr.indices) {
        for (j in i + 1 until arr.size) {
            if (arr[i] + arr[j] == target) {
                println("Pair with sum $target: (${arr[i]}, ${arr[j]})")
                found = true
            }
        }
    }
    if (!found) {
        println("No pairs found with sum $target")
    }
}

fun main() {
    val arr = intArrayOf(3, 3, 2, -5, 2, -1, 5, 1)

    findAllPairsWithSum(arr, 6)
}