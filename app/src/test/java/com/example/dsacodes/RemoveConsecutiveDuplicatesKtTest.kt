package com.example.dsacodes

import org.junit.Assert.*
import kotlin.test.Test

class RemoveConsecutiveDuplicatesKtTest {

    @Test
    fun `removes consecutive duplicate characters`() {
        val input = "ssuuppperrrrr coooommpuuuuuuuuttttter"
        val result = removeConsecutiveDuplicates(input)
        assertEquals("super computer", result)
    }

    @Test
    fun `returns same string when no consecutive duplicates`() {
        val input = "abcdef"
        val result = removeConsecutiveDuplicates(input)
        assertEquals("abcdef", result)
    }

    @Test
    fun `returns empty string when input is empty`() {
        val input = ""
        val result = removeConsecutiveDuplicates(input)
        assertEquals("", result)
    }

    @Test
    fun `handles string with all same characters`() {
        val input = "aaaaaaa"
        val result = removeConsecutiveDuplicates(input)
        assertEquals("a", result)
    }
}