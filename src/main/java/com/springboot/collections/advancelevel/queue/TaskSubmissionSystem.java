package com.springboot.collections.advancelevel.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TaskSubmissionSystem {

    private static BlockingQueue<String> taskQueue = new LinkedBlockingQueue<>();

    public static void main(String[] args) {

        // It is an implementation of the queue interface that supports lock free, thread-sfe
        // operations
        // we can put the value as well take the value simultaneously using ConcurrentLinkedQueue
        // it has high through put

        Thread producer = new Thread(() -> {
            while (true) {
                try {
                    taskQueue.put("Task "+ System.currentTimeMillis());     // Adds task (will use locks integration)
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                    System.out.println("Producer Interrupted: "+e.getMessage());
                }
            }
        });

        Thread consumer = new Thread(() -> {
            while (true) {
                try {
                    String task = taskQueue.take();
                    System.out.println("Processing task: "+task);
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                    System.out.println("Consumer Interrupted: "+e.getMessage());
                }
            }
        });

        producer.start();
        consumer.start();

    }
}
