package com.example.dsacodes

//3 Time Complexity: O(n log n), Space Complexity: O(n)
fun mergeIntervals(intervals: List<List<Int>>): List<List<Int>> {
    if (intervals.isEmpty()) return emptyList()

    val sortedIntervals = intervals.sortedBy { it[0] }

    val result = mutableListOf<List<Int>>()
    var currentStart = sortedIntervals[0][0]
    var currentEnd = sortedIntervals[0][1]

    for (i in 1 until sortedIntervals.size) {
        val start = sortedIntervals[i][0]
        val end = sortedIntervals[i][1]

        if (start <= currentEnd) {
            currentEnd = maxOf(currentEnd, end)
        } else {
            result.add(listOf(currentStart, currentEnd))
            currentStart = start
            currentEnd = end
        }
    }
    result.add(listOf(currentStart, currentEnd))
    return result
}

fun main(){
    val input = listOf(listOf(1, 3), listOf(2, 6), listOf(8, 10), listOf(15, 18))
    println(mergeIntervals(input))
}