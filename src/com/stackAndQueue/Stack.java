package com.stackAndQueue;

public class Stack {
    Node head;
    public void push(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }
        else{
            Node tempNode = head;
            while(tempNode.next != null){
                tempNode=tempNode.next;
            }
            tempNode.next=node;
        }
    }
}
