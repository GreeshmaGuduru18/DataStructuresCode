package com.example.dsacodes

fun evaluate(expression: String): Int {
    val numbers = ArrayDeque<Int>()
    var currentOp = '+'

    for (i in expression.indices) {
        val ch = expression[i]

        if (ch.isDigit()) {
            val num = ch.toString().toInt()
            when (currentOp) {
                '+' -> numbers.addLast(num)
                '-' -> numbers.addLast(-num)
                '*' -> numbers.addLast(numbers.removeLast() * num)
                '/' -> numbers.addLast(numbers.removeLast() / num)
            }
        } else {
            currentOp = ch
        }
    }

    return numbers.sum()
}

fun main() {
    val input = "6+2*4-3"
    val result = evaluate(input)
    println("Result: $result")
}