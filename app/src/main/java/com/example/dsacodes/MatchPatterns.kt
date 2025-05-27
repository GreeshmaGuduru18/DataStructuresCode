package com.example.dsacodes

//5 Time Complexity: O(n * m), Space Complexity: O(m)
fun findAndMatchPattern(words: List<String>, pattern: String): List<String> {
    val result = mutableListOf<String>()
    for (word in words) {
        if (getPattern(word) == getPattern(pattern)) {
            result.add(word)
        }
    }
    return result
}
fun getPattern(s: String): String {
    val map = mutableMapOf<Char, Char>()
    var code = 'a'
    var pattern = ""
    for (ch in s) {
        if (!map.containsKey(ch)) {
            map[ch] = code
            code++
        }
        pattern += map[ch]
    }
    return pattern
}
fun main(){
    val words = listOf("abc", "deq", "mee", "aqq", "dkd", "ccc")
    val pattern = "abb"
    val result = findAndMatchPattern(words, pattern)
    println(result)
}