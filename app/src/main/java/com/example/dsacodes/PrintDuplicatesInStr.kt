package com.example.dsacodes

fun printDuplicateCharacters(input: String) {
    val seen = mutableSetOf<Char>()
    val duplicates = mutableSetOf<Char>()

    for (char in input) {
        if (char != ' ') {
            if (char in seen) {
                duplicates.add(char)
            } else {
                seen.add(char)
            }
        }
    }

    for (char in input) {
        if (char in duplicates) {
            print(char)
            duplicates.remove(char) // to print each duplicate only once
        }
    }
}

fun main() {
    val input = "ssuuppperrrrr coooommpuuuuuuuuttttter"
    printDuplicateCharacters(input)
}