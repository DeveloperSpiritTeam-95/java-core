package com.springboot.collections.advancelevel.queue.blockings;

import java.util.Comparator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueDemo {

    public static void main(String[] args) {

        // Creates a PriorityBlockingQueue with the default initial capacity (11)
        // that orders its elements according to their natural ordering.

        //BlockingQueue<String> queue2 = new PriorityBlockingQueue<>();
        // BlockingQueue<String> queue2 = new PriorityBlockingQueue<>(10);
        BlockingQueue<String> queue2 = new PriorityBlockingQueue<>(5, Comparator.reverseOrder());
        // BlockingQueue<String> queue2 = new PriorityBlockingQueue<>(5, String::compareTo);

        // unbounded
        // put won't block
        // Binary Heap as array and can grow dynamically.
        // Head is based on their natural ordering or a provided Comparator like Priority queue

        queue2.add("apple");
        queue2.add("banana");
        queue2.add("orange");
        queue2.add("cherry");

        System.out.println(queue2);


    }
}
