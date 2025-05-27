package com.example.dsacodes

//1. Time Complexity  O(log n), Space Complexity	O(1)
fun binarySearch(arr: IntArray, target: Int): Int {
    var start = 0
    var end = arr.size - 1

    while (start <= end) {
        val mid = start + (end - start) / 2

        if (arr[mid] == target) {
            return mid
        } else if (arr[mid] < target) {
            start = mid + 1
        } else {
            end = mid - 1
        }
    }
    return -1
}

fun main(){
    val arr = intArrayOf(1, 3, 5, 7, 9, 11)
    val target = 7
    val result = binarySearch(arr, target)
    println("Index: $result")
}