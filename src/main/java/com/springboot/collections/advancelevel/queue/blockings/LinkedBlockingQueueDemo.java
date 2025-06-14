package com.springboot.collections.advancelevel.queue.blockings;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class LinkedBlockingQueueDemo {

    public static void main(String[] args) {

        // when we have more threads, then prefer the LinkedBlockingQueue
        BlockingQueue<Integer> queue1 = new LinkedBlockingQueue<>(10);
        // LinkedBlockingQueue is optionally bounded, or unbounded, backed by LinkedList
        // uses two separate locks for enqueue and dequeue operations
        // Higher concurrency between producers and consumers
        // if we specify the capacity it will fix.
        // otherwise it will Create a LinkedBlockingQueue with a capacity of Integer. MAX_VALUE.




    }
}
