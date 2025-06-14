package com.springboot.seniordev.JavaConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * @author prabhakar, @Date 27-03-2025
 */
public class ExecutorServiceExample {
    public static void main(String[] args) {
        // Create a fixed thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit tasks to the executor
        for (int i = 0; i < 5; i++) {
            final int taskNumber = i;
            executor.submit(() -> {
                System.out.println("Task " + taskNumber + " is running in thread: " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); // Simulate task execution time
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Restore the interrupted status
                    System.err.println("Task " + taskNumber + " interrupted: " + e.getMessage());
                }
                System.out.println("Task " + taskNumber + " completed");
            });
        }

        // Shutdown the executor when you're done with it
        executor.shutdown();
        try {
            executor.awaitTermination(5, java.util.concurrent.TimeUnit.SECONDS); // Wait for tasks to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All tasks finished");
    }
}
