package com.example.dsacodes

//1. integers, find the intersection of the two lists.
//Input: [1, 2, 2, 3], [2, 2, 3, 4]
//Output: [2, 2, 3]
//

// Time complexity : O(m * n)  Space : O(n)
fun findIntersection(list1: List<Int>, list2: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    val tempList2 = list2.toMutableList()

    for (num in list1) {
        if (tempList2.contains(num)) {
            result.add(num)
            tempList2.remove(num)
        }
    }

    return result
}

fun main() {
    val list1 = listOf(1, 2, 2, 3)
    val list2 = listOf(2, 2, 3, 4)

    val result = findIntersection(list1, list2)
    println(result)
}