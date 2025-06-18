package com.example.dsacodes

fun moveZerosToEnd( array: IntArray): IntArray {

    var index = 0

    for(i in array.indices){
        if(array[i]!=0){
            array[index]=array[i]
            index++
        }
    }

    while(index < array.size){
        array[index] = 0
        index++
    }

    return array
}


fun main(){
    val array = intArrayOf(1,2,0,1,0,2,0)
    val result= moveZerosToEnd(array)
    println(result.joinToString())

}

