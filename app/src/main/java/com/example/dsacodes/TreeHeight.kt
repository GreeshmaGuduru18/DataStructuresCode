package com.example.dsacodes

import java.util.LinkedList
import java.util.Queue

fun BinaryTree.findHeight(): Int {
    if (root == null) return 0

    val queue: Queue<Node> = LinkedList()
    queue.add(root!!)
    var height = 0

    while (queue.isNotEmpty()) {
        val levelSize = queue.size
        repeat(levelSize) {
            val current = queue.poll()
            current.left?.let { queue.add(it) }
            current.right?.let { queue.add(it) }
        }
        height++
    }

    return height
}

fun main() {
    val tree = BinaryTree()
    tree.insert(50)
    tree.insert(30)
    tree.insert(60)
    tree.insert(20)
    tree.insert(40)
    tree.insert(10)

    println("Height (Iterative): ${tree.findHeight()}")
}