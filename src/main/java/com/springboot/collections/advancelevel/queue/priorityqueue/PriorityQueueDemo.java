package com.springboot.collections.advancelevel.queue.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        // part of Queue interface
        // orders elements based on their natural ordering (for primitive lowest first)
        // custom comparator for customized ordering
        // does not allow null elements

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        //PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
                                                            // (x, y) -> x - y  ==> ascending order
                                                            // (x, y) -> y - x  ==> descending order

        // does not maintain insertion order

        queue.add(78);
        queue.add(90);

        queue.offer(34);

        queue.add(80);
        queue.add(70);
        queue.add(60);

        queue.offer(67);
        queue.add(40);

        // elements
        System.out.println(queue);

        // get element from head
        System.out.println(queue.peek());

        System.out.println(queue);

        // remove element from end
        System.out.println(queue.remove());
        System.out.println(queue.poll());

        System.out.println(queue);      // not sorted, or we don't know the order of queue.

        // while removing elements using loop
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        // internal working flow of priority queue
        // PriorityQueue is implemented as a min-heap by default (for natural ordering)

        // https://www.cs.usfca.edu/~galles/visualization/Heap.html



    }
}
