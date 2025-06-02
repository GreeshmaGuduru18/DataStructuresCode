package com.example.dsacodes

// Find the second largest number from the array
//Space Complexity = O(1)
// Time Complexity = O(n)

fun findSecondLargest(arr: IntArray): Int {
    if (arr.size < 2) return -1

    var largest = Int.MIN_VALUE
    var secondLargest = Int.MIN_VALUE

    for (i in arr.indices) {
        if (arr[i] > largest) {
            secondLargest = largest
            largest = arr[i]
        } else if (arr[i] > secondLargest && arr[i] != largest) {
            secondLargest = arr[i]
        }
    }

    return secondLargest
}

fun main() {
    val arr = intArrayOf(6, 4, 9, 2, 10,13)

    println("Second Largest: ${findSecondLargest(arr)}")

}