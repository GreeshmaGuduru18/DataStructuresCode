package com.example.dsacodes

fun evaluatePostfix(expression: String): Int {
    val stack = ArrayDeque<Int>()

    for (ch in expression) {
        when {
            ch.isDigit() -> stack.addLast(ch.toString().toInt())
            ch in "+-*/^" -> {
                val b = stack.removeLast()
                val a = stack.removeLast()
                val result = when (ch) {
                    '+' -> a + b
                    '-' -> a - b
                    '*' -> a * b
                    '/' -> a / b
                    else -> 0
                }
                stack.addLast(result)
            }
        }
    }

    return stack.last()
}

fun main() {
    val postfix = "23*54*+9-"
    val result = evaluatePostfix(postfix)
    println("Postfix Expression: $postfix")
    println("Result: $result")
}