package com.example.dsacodes

//2.   Time Complexity: O(n^2) , Space Complexity: O(k)
fun findPairsWithTargetSum(arr: List<Int>, target: Int): List<List<Int>> {
    val pairs = mutableListOf<List<Int>>()

    for (i in 0 until arr.size) {
        for (j in i + 1 until arr.size) {
            if (arr[i] + arr[j] == target) {
                pairs.add(listOf(arr[i], arr[j]))
            }
        }
    }
    return pairs
}

fun main(){
    val input = listOf(1, 2, 3, 4, 5)
    val target = 5
    println(findPairsWithTargetSum(input, target))
}