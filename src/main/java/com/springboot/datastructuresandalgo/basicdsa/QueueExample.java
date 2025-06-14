package com.springboot.datastructuresandalgo.basicdsa;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    // Queue (FIFO - First In, First Out)
    // Operations: enqueue(), dequeue(), peek()
    // Time Complexity: O(1) for insertion and deletion.

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Front element: " + queue.peek());  // 10
        System.out.println("Dequeued: " + queue.poll()); // 10

        System.out.println("Queue after dequeue: " + queue);
    }
}
