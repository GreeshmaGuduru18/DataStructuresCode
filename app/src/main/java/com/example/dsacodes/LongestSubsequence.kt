package com.example.dsacodes


//3. Given an ArrayList of integers, find the length of the longest increasing subsequence.
//Input: [10, 9, 2, 5, 3, 7, 101, 18]
//Output: 4
//Explanation: The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4.


fun main() {
    val nums = listOf(10, 9, 2, 5, 3, 7, 101, 18)
    println("Length of LIS: ${longestIncreasingSubsequence(nums)}")
}

fun longestIncreasingSubsequence(nums: List<Int>): Int {
    if (nums.isEmpty()) return 0

    val dp = MutableList(nums.size) { 1 }

    for (i in 1 until nums.size) {
        for (j in 0 until i) {
            if (nums[i] > nums[j]) {
                dp[i] = maxOf(dp[i], dp[j] + 1)
            }
        }
    }

    return dp.maxOrNull()!!
}