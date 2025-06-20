package com.example.dsacodes

fun onlyWayUp(B: Int, ar: ArrayList<Int>): Int {
    var count = 0
    for (i in 1 until ar.size) {
        if (ar[i] <= ar[i - 1]) {
            val diff = ar[i - 1] - ar[i] + 1
            val steps = (diff + B - 1) / B
            ar[i] += steps * B
            count += steps
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