package com.example.dsacodes

fun evaluatePrefix(expression: String): Int {
    val stack = ArrayDeque<Int>()

    for (i in expression.length - 1 downTo 0) {
        val ch = expression[i]

        when {
            ch.isDigit() -> {
                stack.addLast(ch.toString().toInt())
            }

            ch in "+-*/^" -> {
                val a = stack.removeLast()
                val b = stack.removeLast()
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
    val prefix = "-+*16*243"
    val result = evaluatePrefix(prefix)
    println("Prefix Expression: $prefix")
    println("Result: $result")
}