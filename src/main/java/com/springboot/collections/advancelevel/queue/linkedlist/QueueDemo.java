package com.springboot.collections.advancelevel.queue.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        System.out.println("Queue Reference Task: ");
        Queue<Integer> queue = new LinkedList<>();
        // Add elements in 2 ways of methods: enqueue

        queue.add(1);
        queue.offer(39);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println("size: " + queue.size());
        System.out.println(queue);

        System.out.println("Remove elements in 2 ways of methods: dequeue");
        System.out.println(queue.remove());     // throws exception if empty
        System.out.println(queue);

        System.out.println(queue.poll());       // better with queue use case
        System.out.println(queue);

        System.out.println("Get element in 2 ways of methods: peek");
        System.out.println(queue.element());    // throws exception if empty
        System.out.println(queue);

        System.out.println(queue.peek());       // better with queue use case
        System.out.println(queue);


    }
}
