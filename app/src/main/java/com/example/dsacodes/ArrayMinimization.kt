package com.example.dsacodes

fun minimization(A: Array<Int>,B: Array<Int>, C: Array<Int>): Int {

    val sortedA = A.sorted()
    val sortedB = B.sorted()
    val sortedC = C.sorted()

    var minDiff = Int.MAX_VALUE

    var i =0
    var j =0
    var k =0

    while(i < sortedA.size && j < sortedB.size && k < sortedC.size ){
        val a = sortedA[i]
        val b = sortedB[j]
        val c = sortedC[k]

        val maxVal = maxOf(a,b,c)
        val minVal = maxOf(a,b,c)

        minDiff = minOf(minDiff,maxVal - minVal)

        when(minVal){
            a -> i++
            b ->j++
            else -> k++
        }
    }


    return minDiff

    }

fun main(){
    val A = arrayOf(1, 4, 10)
    val B = arrayOf(2, 15, 20)
    val C = arrayOf(10, 12)

    val result = minimization(A, B, C)
    println("Minimum difference: $result")
}

