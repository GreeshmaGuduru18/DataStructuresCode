package com.example.dsacodes

// 2. Given an integer numRows, generate the first numRows of Pascal's triangle.
//Input: 5
//Output:
//[
//     [1],
//    [1,1],
//   [1,2,1],
//  [1,3,3,1],
//[1,4,6,4,1]


fun generatePascalTriangle(numRows: Int): List<List<Int>> {
    val result = mutableListOf<List<Int>>()

    for (i in 0 until numRows) {
        val row = MutableList(i + 1) { 1 }
        for (j in 1 until i) {
            row[j] = result[i - 1][j - 1] + result[i - 1][j]
        }
        result.add(row)
    }
    return result
}

fun main() {
    val numRows = 5
    val triangle = generatePascalTriangle(numRows)

    for (row in triangle) {
        println(row)
    }
}