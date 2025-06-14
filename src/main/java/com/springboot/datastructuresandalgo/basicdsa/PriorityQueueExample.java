package com.springboot.datastructuresandalgo.basicdsa;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    // Priority Queue (Min Heap)
    // A queue where elements are processed based on priority.
    // Time Complexity: O(log n) for insertion and removal.

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println("Smallest element: " + pq.peek()); // 10 (Min Heap)
        System.out.println("Removed element: " + pq.poll()); // 10

        System.out.println("Priority Queue after removal: " + pq);
    }
}
