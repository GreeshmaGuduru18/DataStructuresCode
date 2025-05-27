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
    val num3 = intArrayOf(1, 1, 2)
    val newLength = removeDuplicates(num3)

    println("Length: $newLength")
    println("Modified Array: ${num3.take(newLength)}")
}