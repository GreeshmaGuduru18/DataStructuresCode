package com.example.dsacodes

fun prefixToPostfix(expression: String): String {
    val stack = ArrayDeque<String>()

    for (i in expression.length - 1 downTo 0) {
        val ch = expression[i]

        if (ch.isLetter()) {
            stack.addLast(ch.toString())
        } else if (ch in "+-*/^") {
            val op1 = stack.removeLast()
            val op2 = stack.removeLast()
            val newExpr = op1 + op2 + ch
            stack.addLast(newExpr)
        }
    }

    return stack.last()
}

fun main() {
    val prefix = "-+a*bcd"
    val postfix = prefixToPostfix(prefix)
    println("Prefix: $prefix")
    println("Postfix: $postfix")
}