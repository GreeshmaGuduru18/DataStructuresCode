package com.example.dsacodes

fun findMajorityElement(nums: IntArray): Int? {
    val countMap = mutableMapOf<Int, Int>()
    val n = nums.size

    for (num in nums) {
        val count = countMap.getOrDefault(num, 0) + 1
        countMap[num] = count

        if (count > n / 2) {
            return num
        }
    }

    return -1
}

fun main() {
    val nums = intArrayOf(2, 2, 1, 2, 2)
    val result = findMajorityElement(nums)
    println(result ?: "No majority element")
}