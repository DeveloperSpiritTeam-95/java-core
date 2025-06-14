package com.springboot.collections.advancelevel.queue;

import com.springboot.collections.advancelevel.queue.blockings.BlockingQueueDemo;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConcurrentLinkedQueueDemo {

    private static ConcurrentLinkedQueue<String> taskQueue = new ConcurrentLinkedQueue<>();

    public static void main(String[] args) {

        // It is an implementation of the queue interface that supports lock free, thread-sfe
        // operations
        // we can put the value as well take the value simultaneously using ConcurrentLinkedQueue
        // it has high through put

        Thread producer = new Thread(() -> {
            while (true) {
                try {
                    taskQueue.add("Task " + System.currentTimeMillis());
                } catch (Exception e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Producer Interrupted: " + e.getMessage());
                }
            }
        });

        Thread consumer = new Thread(() -> {
            while (true) {
                try {
                    String task = taskQueue.poll();
                    System.out.println("Processing task: " + task);
                } catch (Exception e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Consumer Interrupted: " + e.getMessage());
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
