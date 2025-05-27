package com.example.dsacodes

fun rotate(nums: IntArray, k: Int) {
    val n = nums.size
    val steps = k % n

    reverse(nums, 0, n - 1)
    reverse(nums, 0, steps - 1)
    reverse(nums, steps, n - 1)
}

fun reverse(nums: IntArray, start: Int, end: Int) {
    var i = start
    var j = end
    while (i < j) {
        val temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
        i++
        j--
    }
}

fun main(){
    val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    val k = 3
    rotate(nums, k)
    println(nums.joinToString())
}