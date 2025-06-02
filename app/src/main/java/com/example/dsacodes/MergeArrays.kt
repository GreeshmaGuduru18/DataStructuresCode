package com.example.dsacodes

//3. Merge two arrays to form a third array e.g.
// First array: 10, 50, 20, 30, 70, 80, 40 Second array: 25, 75, 5, 25
// Merged array should be: 10, 25, 50, 75, 20, 5, 30, 25, 70, 80, 40

//Time Complexity = O(n + m)
//Space Complexity = O(n + m)

fun mergeArrays(first: IntArray, second: IntArray): IntArray {
    val size = first.size + second.size
    val merged = IntArray(size)

    var i = 0
    var j = 0
    var k = 0

    while (i < first.size || j < second.size) {
        if (i < first.size) {
            merged[k] = first[i]
            i++
            k++
        }
        if (j < second.size) {
            merged[k] = second[j]
            j++
            k++
        }
    }

    return merged
}

fun main() {
    val first = intArrayOf(10, 50, 20, 30, 70, 80, 40)
    val second = intArrayOf(25, 75, 5, 25)

    val result = mergeArrays(first, second)

    println("Merged Array: ${result.joinToString(", ")}")
}
