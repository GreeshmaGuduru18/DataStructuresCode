package com.example.dsacodes

class BinarySearchTree {
    var root : Node? = null

    fun insert(value: Int){
        val newNode = Node(value)

        if(root==null){
            root = newNode
            return
        }

       var current = root

        while(true){
            if(value<current!!.value){
                if(current.left == null){
                    current.left = newNode
                    return
                }
                current = current.left
            }else if(value>current.value){
                if(current.right==null){
                    current.right = newNode
                    return
                }
                current=current.right
            }else{
                return
            }
        }
    }

    fun inorderTraversal() {
        val stack = mutableListOf<Node>()
        var current = root

        while (current != null || stack.isNotEmpty()) {
            if (current != null) {
                stack.add(current)
                current = current.left
            } else {
                current = stack.removeAt(stack.size - 1)
                print("${current.value} ")
                current = current.right
            }
        }
    }

    fun preorderTraversal() {
        if (root == null) return
        val stack = mutableListOf<Node>()
        stack.add(root!!)

        while (stack.isNotEmpty()) {
            val current = stack.removeAt(stack.size - 1)
            print("${current.value} ")

            if (current.right != null) stack.add(current.right!!)
            if (current.left != null) stack.add(current.left!!)
        }
    }

    fun postorderTraversal() {
        if (root == null) return
        val stack1 = mutableListOf<Node>()
        val stack2 = mutableListOf<Node>()

        stack1.add(root!!)

        while (stack1.isNotEmpty()) {
            val current = stack1.removeAt(stack1.size - 1)
            stack2.add(current)

            if (current.left != null) stack1.add(current.left!!)
            if (current.right != null) stack1.add(current.right!!)
        }

        while (stack2.isNotEmpty()) {
            val node = stack2.removeAt(stack2.size - 1)
            print("${node.value} ")
        }
    }
}


fun main(){
    val bst = BinarySearchTree()
    bst.insert(50)
    bst.insert(30)
    bst.insert(40)
    bst.insert(20)
    bst.insert(60)
    bst.insert(10)

    println("In-order Traversal:")
    bst.inorderTraversal()

    println("\nPre-order :")
    bst.preorderTraversal()

    println("\nPost-order:")
    bst.postorderTraversal()
}

