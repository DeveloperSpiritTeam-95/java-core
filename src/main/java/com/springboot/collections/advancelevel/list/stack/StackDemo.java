package com.springboot.collections.advancelevel.list.stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;

public class StackDemo {

    // we can achieve the stack LIFO rule using LinkedList as well ArrayList
    // but the logic will be complex as well not thread safe data we perform.
    // stack thread safe because of extends with Vector (it is by default thread safe)

    public static void main(String[] args) {

        // LIFO rule stack follows this behaviour
        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.size());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.size());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.empty());

        System.out.println(stack.get(stack.search(3)));

        // we can achieve the peek pop methods using LinkedList as well ArrayList

        System.out.println("Linked List Example: ");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        System.out.println("LinkedList: "+linkedList);
        System.out.println("get Last element: "+linkedList.getLast()); // peek
        System.out.println("remove Last element: "+linkedList.removeLast()); // pop
        linkedList.addLast(23);   // push   element added in last
        linkedList.addFirst(34);  // push   element added in first
        System.out.println(linkedList);

        System.out.println("Array List Example: ");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);


        System.out.println("ArrayList: "+arrayList);
        System.out.println("get First element: "+arrayList.get(0));
       // System.out.println("remove First element: "+arrayList.remove(0));
        System.out.println("get Last element: "+arrayList.get(arrayList.size()-1));// peek
        System.out.println("remove Last element: "+arrayList.remove(arrayList.size()-1)); // pop
        System.out.println("ArrayList: "+arrayList);

        arrayList.add(arrayList.size(), 34);    // push element added in the last
        System.out.println("ArrayList: "+arrayList);


    }
}
