package com.example.dsacodes

fun validMountainArray(arr: IntArray): Boolean {
    if (arr.size < 3) {
        return false
    }

    var i = 0


    while (i + 1 < arr.size && arr[i] < arr[i + 1]) {
        i++
    }

    if (i == 0 || i == arr.lastIndex){
        return false
    }


    while (i + 1 < arr.size && arr[i] > arr[i + 1]) {
        i++
    }

    return i == arr.lastIndex
}


fun main() {
    println(validMountainArray(intArrayOf(0,2,3,4,5,2,1,0)))
    println(validMountainArray(intArrayOf(0,2,3,3,5,2,1,0)))

}
