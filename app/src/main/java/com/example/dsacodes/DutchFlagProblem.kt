package com.example.dsacodes

fun sortColors(nums: IntArray) {
    var count0 = 0
    var count1 = 0
    var count2 = 0


    for (num in nums) {
        when (num) {
            0 -> count0++
            1 -> count1++
            2 -> count2++
        }
    }

    var i = 0
    repeat(count0) { nums[i++] = 0 }
    repeat(count1) { nums[i++] = 1 }
    repeat(count2) { nums[i++] = 2 }
}

fun main() {
    val nums = intArrayOf(2, 0, 2, 1, 1, 0)
    sortColors(nums)
    println(nums.joinToString())  
}