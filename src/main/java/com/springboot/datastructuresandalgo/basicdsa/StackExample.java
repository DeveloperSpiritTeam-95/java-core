package com.springboot.datastructuresandalgo.basicdsa;

import java.util.Stack;

public class StackExample {

    // Stack (LIFO - Last In, First Out)
    // Operations: push(), pop(), peek()
    // Time Complexity: O(1) for push and pop.

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());  // 30
        System.out.println("Popped element: " + stack.pop()); // 30

        System.out.println("Stack after pop: " + stack);
    }
}
