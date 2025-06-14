package com.springboot.collections.advancelevel.queue.blockings;

import java.util.Comparator;
import java.util.concurrent.*;

public class BlockingQueueDemo {

    // thread safe
    // most usage in threads
    public static void main(String[] args) {

        // wait for queue to become non-empty / wait for space
        // simplify the concurrency problems like producer and consumers
        // standard queue --> immediately
            // empty  --> remove (no waiting)
            // full   --> add (no waiting)

        //BlockingQueue
            // put -->   Blocks if the queue is full until space becomes available
            // take -->  Blocks if the queue is empty until an element becomes available.
            // offer --> Waits for space to become available, up to the specified timeout

        // when we have limited threads, then prefer the ArrayBlockingQueue
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);
        // ArrayBlockingQueue is a bounded, blocking queue backed by circular array
        // low memory head
        // using single lock for both enqueue and dequeue operations.
        // more threads --> problem



        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));

        producer.start();
        consumer.start();

    }
}

class Producer implements Runnable {
    private BlockingQueue<Integer> queue;
    private int value = 0;
    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Producer produced: " + value);
                // queue.offer(value++);       // Blocks if the queue is empty. not preferred
                // queue.offer(value++, 2000,TimeUnit.MILLISECONDS);    // also not preferable
                queue.put(value++);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Producer interrupted"+ e.getMessage());
            }

        }
    }
}


class Consumer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Integer value = queue.take();
                System.out.println("Consumer consumed: " + value);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Consumer interrupted"+ e.getMessage());
            }

        }
    }
}
