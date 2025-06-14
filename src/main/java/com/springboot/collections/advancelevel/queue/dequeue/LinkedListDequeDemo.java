package com.springboot.collections.advancelevel.queue.dequeue;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListDequeDemo {

    // not thread safe

    public static void main(String[] args) {

        // same functionality in ArrayDeque but accuracy and performance differ

        // high memory, pointers, or more nodes
        // quick modify because of LinkedList follows Node base insertions or modifications.

        /*
        LinkedList class is likely to be faster than Arrays in the point data modifications,
        and faster than ArrayDeque when used as a queue, Deque and List.
        */

        Deque<Integer> deque2 = new LinkedList<>();

        deque2.add(23);
        deque2.addFirst(45);
        deque2.addLast(56);
        deque2.offer(78);
        deque2.offerFirst(90);
        deque2.offerLast(50);

        // 90, 45, 23, 56, 78, 50
        System.out.println(deque2);

        // retrieves the first and last elements
        System.out.println("First Element: " + deque2.getFirst());
        System.out.println("Last Element: " + deque2.getLast());

        // removes the first element two times
        System.out.println("Removes First Element: "+ deque2.removeFirst());   // Removes 90
        System.out.println("Poll First Element: "+ deque2.pollFirst());     // Removes 45

        // 23, 56, 78, 50
        System.out.println(deque2);

        // retrieves the first and last elements
        System.out.println("Peek Element: " + deque2.peek());
        System.out.println("Peek First Element: " + deque2.peekFirst());
        System.out.println("Peek Last Element: " + deque2.peekLast());

        // 23, 56, 78, 50
        System.out.println(deque2);


        // removes the first element two times
        System.out.println("Removes Last Element: "+ deque2.removeLast());
        System.out.println("Poll Last Element: " + deque2.pollLast());

        // retries the elements in respective manner
        System.out.println("Get First Element: " + deque2.getFirst());
        System.out.println("Get Last Element: " + deque2.getLast());

        System.out.println("Peek First Element: " + deque2.peekFirst());
        System.out.println("Peek Last Element: " + deque2.peekLast());

        // 23, 56
        System.out.println(deque2);


    }
}
