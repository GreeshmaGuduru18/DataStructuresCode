package com.example.dsacodes

fun onlyWayUp(B: Int, ar: ArrayList<Int>): Int {
    var count = 0
    for (i in 1 until ar.size) {
        if (ar[i] <= ar[i - 1]) {
            // ar[i] + k * B > ar[i - 1]
            val bCount = ((ar[i - 1] - ar[i]) / B) + 1
            ar[i] += bCount * B
            count += bCount
        }
    }
    return count
}

fun main() {
    val B = 2
    val ar = arrayListOf(1, 5, 5, 4)

    val result = onlyWayUp(B,ar)

    println("Total times B added: $result")
    println("Modified array: $ar")
}