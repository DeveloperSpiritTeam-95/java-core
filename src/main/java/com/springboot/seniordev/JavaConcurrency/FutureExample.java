package com.springboot.seniordev.JavaConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
/**
 * @author prabhakar, @Date 27-03-2025
 */
public class FutureExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Define a task using Callable (which returns a value)
        Callable<String> task = () -> {
            System.out.println("Task is running in thread: " + Thread.currentThread().getName());
            Thread.sleep(2000);
            return "Task completed successfully!";
        };

        // Submit the task and get a Future
        Future<String> future = executor.submit(task);

        try {
            System.out.println("Waiting for task to complete...");
            String result = future.get(); // Blocks until the result is available
            System.out.println("Result: " + result);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Task interrupted: " + e.getMessage());
        } catch (ExecutionException e) {
            System.err.println("Task execution failed: " + e.getMessage());
        } finally {
            executor.shutdown();
        }
    }
}
