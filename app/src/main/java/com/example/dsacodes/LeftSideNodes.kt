package com.example.dsacodes

import java.util.LinkedList
import java.util.Queue

class Node(val value: Int) {
    var left: Node? = null
    var right: Node? = null
}

class BinaryTree {
    var root: Node? = null

    fun insert(value: Int) {
        val newNode = Node(value)
        if (root == null) {
            root = newNode
            return
        }

        var current = root
        while (true) {
            if (value < current!!.value) {
                if (current.left == null) {
                    current.left = newNode
                    return
                }
                current = current.left
            } else if (value > current.value) {
                if (current.right == null) {
                    current.right = newNode
                    return
                }
                current = current.right
            } else {
                return // Duplicate, do nothing
            }
        }
    }

    // Iterative: Print only left child nodes
    fun printLeftChildNodes() {
        var queue = LinkedList<Node>()
        root?.let { queue.add(it) }

        while (queue.isNotEmpty()) {
            val node = queue.removeFirst()

            node.left?.let {
                println(it.value)
                queue.add(it)
            }

            node.right?.let {
                queue.add(it)
            }
        }
    }
}

fun main() {
    val tree = BinaryTree()
    tree.insert(50)
    tree.insert(30)
    tree.insert(20)
    tree.insert(40)
    tree.insert(60)
    tree.insert(10)

    println("Left child nodes (non-recursive):")
    tree.printLeftChildNodes()
}