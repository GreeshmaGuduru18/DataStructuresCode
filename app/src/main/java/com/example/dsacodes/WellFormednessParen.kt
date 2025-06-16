package com.example.dsacodes

import java.util.Stack

fun isValid(s: String): Boolean {
    val stack = Stack<Char>()
    val bracketsMap = hashMapOf(')' to '(', '}' to '{', ']' to '['
    )

    for (char in s) {
        if (bracketsMap.containsKey(char)) {
            if (!stack.isEmpty() && stack.peek() == bracketsMap[char]) {
                stack.pop()
            } else {
                return false
            }
        } else {
            stack.push(char)
        }
    }

    return stack.isEmpty()
}

fun main() {
    val input = "{[())]}"
    println( isValid(input))
}