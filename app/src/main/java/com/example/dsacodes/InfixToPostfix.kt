package com.example.dsacodes

fun precedence(op: Char): Int {
    return when (op) {
        '+', '-' -> 1
        '*', '/' -> 2
        '^' -> 3
        else -> -1
    }
}

fun infixToPostfix(expression: String): String {
    val stack = ArrayDeque<Char>()
    val result = StringBuilder()

    for (ch in expression) {
        if (ch.isLetter()) {
            result.append(ch)
        } else {
            while (stack.isNotEmpty() && precedence(ch) <= precedence(stack.last())) {
                result.append(stack.removeLast())
            }
            stack.addLast(ch)
        }
    }

    while (stack.isNotEmpty()) {
        result.append(stack.removeLast())
    }

    return result.toString()
}

fun main() {
    val infix = "a+b*c-d"
    val postfix = infixToPostfix(infix)
    println("Infix: $infix")
    println("Postfix: $postfix")
}