package com.example.dsacodes

fun findSecondSmallest(arr: IntArray): Int {
    var smallest = Int.MAX_VALUE
    var secondSmallest = Int.MAX_VALUE
    for (i in arr.indices) {
        if (arr[i] < smallest) {
            secondSmallest = smallest
            smallest = arr[i]
        } else if (arr[i] < secondSmallest && arr[i] != smallest) {
            secondSmallest = arr[i]
        }
    }
    return  secondSmallest
}


fun main() {
    val arr = intArrayOf(2, 3, 7, 1, 6, 9, 8)

    println("Second Smallest: ${findSecondSmallest(arr)}")
}
