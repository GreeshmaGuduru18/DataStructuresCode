package com.example.dsacodes

fun CountNoOfOcuurencesInStr(str: String):Map<Char,Int>{
    val mp = mutableMapOf<Char,Int>()

    for(ch in str){
        if (mp.containsKey(ch)){
            mp[ch]=mp[ch]!!+1
        }else{
            mp[ch]=1
        }
    }
    return mp

}

fun main(){
    val str = "aaabddcacd"
    println(CountNoOfOcuurencesInStr(str))
}