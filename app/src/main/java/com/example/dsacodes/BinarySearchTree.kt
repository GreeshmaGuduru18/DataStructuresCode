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


}


class Node(var value:Int){
    var left : Node? = null
    var right : Node? = null
}