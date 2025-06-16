package com.example.dsacodes

fun postfixToInfix(expression: String): String {
    val stack = ArrayDeque<String>()

    for (ch in expression) {
        if (ch.isLetter()) {
            stack.addLast(ch.toString())
        } else if (ch in "+-*/^") {
            val op2 = stack.removeLast()
            val op1 = stack.removeLast()
            val newExpr = "($op1$ch$op2)"
            stack.addLast(newExpr)
        }
    }

    return stack.last()
}

fun main() {
    val postfix = "abc*+d-"
    val infix = postfixToInfix(postfix)
    println("Postfix: $postfix")
    println("Infix: $infix")
}