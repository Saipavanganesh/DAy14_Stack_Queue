package com.stackAndQueue;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Stack");
        System.out.println();
        Stack stack = new Stack();
        stack.pop();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.display();
        stack.peak();
        stack.display();
        stack.pop();
    }
}
