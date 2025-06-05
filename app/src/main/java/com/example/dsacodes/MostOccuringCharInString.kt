package com.example.dsacodes

fun mostRepeatedChar(str:String):Char?{
    val mp = mutableMapOf<Char,Int>()
    for(ch in str){
        if(mp.containsKey(ch)){
            mp[ch] = mp[ch]!!+1
        }else{
            mp[ch]=1
        }
    }

    var maxChar: Char? = null
    var maxCount = 0

    for((key,value) in mp) {
        if (value > maxCount) {
            maxCount = value
            maxChar = key
        }
    }
    return maxChar
}

fun main(){
    val str ="aadadfsafsdsaallllllllllll"
    println(mostRepeatedChar(str))
}