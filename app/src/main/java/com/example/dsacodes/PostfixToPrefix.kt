package com.example.dsacodes

fun postfixToPrefix(expression: String): String {
    val stack = ArrayDeque<String>()

    for (ch in expression) {
        if (ch.isLetter()) {
            stack.addLast(ch.toString())
        } else if (ch in "+-*/^") {
            val op2 = stack.removeLast()
            val op1 = stack.removeLast()
            val newExpr = ch + op1 + op2
            stack.addLast(newExpr)
        }
    }

    return stack.last()
}

fun main() {
    val postfix = "abc*+d-"
    val prefix = postfixToPrefix(postfix)
    println("Postfix: $postfix")
    println("Prefix: $prefix")
}