package com.springboot.seniordev.ThreadSafetyandSynchronization;

/**
 * @author prabhakar, @Date 28-03-2025
 */

public class SynchronizationExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Create multiple threads to increment the counter
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    // counter.incrementSynchronizedMethod(); // Using synchronized method
                    counter.incrementSynchronizedBlock(); // Using synchronized block
                }
            });
            threads[i].start();
        }

        // Wait for all threads to complete
        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Final count: " + counter.getCount()); // Should be 10000
    }
}

class Counter {
    private int count = 0;
    private final Object lock = new Object(); // Explicit lock object

    // Synchronized method
    public synchronized void incrementSynchronizedMethod() {
        count++;
    }

    // Synchronized block
    public void incrementSynchronizedBlock() {
        synchronized (lock) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}