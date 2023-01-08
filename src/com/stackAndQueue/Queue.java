package com.stackAndQueue;

public class Queue {
    Node front = null;
    Node rear = null;

    /* Enqueue in Queue */
    public void enqueue(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(front == null && rear == null){
            front = node;
            rear = node;
        }
        else{
            rear.next = node;
            rear = node;
        }
    }

    /* Dequeue */
    public void dequeue(){
        if(front == null && rear == null){
            System.out.println("Queue is empty");
        }
        else{
            front = front.next;
        }
    }

    /* Display in Queue */
    public void display(){
        Node temp = front;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
