package com.example.dsacodes

fun MaxSumHeights(arr: Array<Int>): Int{

    for(i in 1 until arr.size-1){
        if(arr[i]<arr[i-1] && arr[i]< arr[i+1]){
            if(arr[i-1]<arr[i+1]){
                arr[i-1] = minOf(arr[i-1],arr[i],arr[i+1])
            }else{
                arr[i+1] = minOf(arr[i-1],arr[i],arr[i+1])
            }
        }
    }

    return arr.sum()
}

fun main() {
    val maxHeight = arrayOf(4,8,6,7)
    val result = MaxSumHeights(maxHeight)
    println("Sum = $result")
}

