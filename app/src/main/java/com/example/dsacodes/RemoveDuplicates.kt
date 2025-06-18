package com.example.dsacodes

fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    var i = 0
    for (j in 1 until nums.size) {
        if (nums[j] != nums[i]) {
            i++
            nums[i] = nums[j]
        }
    }
    return i + 1
}

fun main(){
    val num = intArrayOf(1, 1, 2)
    val newArray = removeDuplicates(num)

    println("Modified Array: ${num.take(newArray)}")
}