package com.example.dsacodes

fun removeDuplicates(str:String):String{

    val strb = StringBuilder()
    for(ch in str){
        if(!strb.contains(ch)){
            strb.append(ch)
        }
    }

    return strb.toString()
}


fun main(){
   val str = "abcabcddg"
    val res = removeDuplicates(str)
    println(res)
}
