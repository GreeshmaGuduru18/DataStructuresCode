package com.example.dsacodes

fun infixToPrefix(expression: String): String {
    val reversed = expression.reversed()
    val swapped = reversed.map {
        when (it) {
            '(' -> ')'
            ')' -> '('
            else -> it
        }
    }.joinToString("")

    val postfix = infixToPostfix(swapped)
    return postfix.reversed()
}

fun main() {
    val infix = "a+b*c-d"
    val prefix = infixToPrefix(infix)
    println("Prefix: $prefix")
}