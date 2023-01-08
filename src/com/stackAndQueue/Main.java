package com.stackAndQueue;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Stack");
        System.out.println();
        Queue queue = new Queue();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.display();
    }
}
