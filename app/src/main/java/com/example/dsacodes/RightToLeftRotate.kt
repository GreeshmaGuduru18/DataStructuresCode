package com.example.dsacodes

fun rotateLeft(arr: IntArray, n: Int): IntArray {
    val size = arr.size
    val result = IntArray(size)
    val shift = n % size  // To handle n > size

    for (i in arr.indices) {
        val newIndex = (i - shift + size) % size
        result[newIndex] = arr[i]
    }

    return result
}

fun main() {
    val original = intArrayOf(1, 2, 3, 4, 5)

    val rightRotated = rotateRight(original, 2)

    println("Left rotation: ${rightRotated.joinToString()}")

}