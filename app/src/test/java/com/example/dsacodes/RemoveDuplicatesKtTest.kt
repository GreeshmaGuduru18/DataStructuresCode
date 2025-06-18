package com.example.dsacodes

import org.junit.Assert.*
import org.junit.Test

class RemoveDuplicatesKtTest {

    @Test
    fun `returns zero when the array is empty`(){
        val nums = intArrayOf()
        val actualResult =  removeDuplicates(nums)
        assertEquals(0, actualResult)
    }

    @Test
    fun `test if there are no duplicates`(){
        val nums = intArrayOf(1,2,3)
        val actualResult = removeDuplicates(nums)
        assertEquals(nums.size, actualResult)
    }

    @Test
    fun `returns 1 when array has one element`() {
        val nums = intArrayOf(5)
        val actualResult = removeDuplicates(nums)
        assertEquals(1, actualResult)
    }

    @Test
    fun removesDuplicatesWithRepeatedNumbers() {
        val nums = intArrayOf(1, 1, 2,4,5)
        val newLength = removeDuplicates(nums)
        assertEquals(4, newLength)
        assertArrayEquals(intArrayOf(1, 2,4,5), nums.copyOfRange(0, newLength))
    }

}