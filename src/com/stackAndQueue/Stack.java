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
    /* Peak in stack */
    public void peak(){
        if(top == null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(top.data);
        }

    }
    /* Pop in stack */
    public void pop(){
        if(top == null){
            System.out.println("Stack is empty");
        }
        else{
            top = top.next;
            display();
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
