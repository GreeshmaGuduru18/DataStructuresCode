package com.example.dsacodes

//1  Time Complexity: O(n), Space Complexity: O(1)
fun maxProfit(stocks:List<Int>): Int{
    if (stocks.size < 2) return 0

    var min = stocks[0]
    var maxProfit = 0

    for (i in 1 until stocks.size) {
        if (stocks[i] < min) {
            min = stocks[i]
        } else {
            maxProfit = maxOf(maxProfit, stocks[i] - min)
        }
    }

    return maxProfit
}

fun main() {
    val prices = listOf(7, 1, 5, 3, 6, 4)
    println(maxProfit(prices))
}