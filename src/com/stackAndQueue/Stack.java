package com.stackAndQueue;

import com.sun.org.apache.xpath.internal.operations.Mod;

public class Stack {
    Node top;
    /* Push in stack */
    public void push(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(top == null){
            top = node;
        }
        else{
            node.next = top;
            top = node;
        }
    }
    public void display(){
        Node temp = top;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
