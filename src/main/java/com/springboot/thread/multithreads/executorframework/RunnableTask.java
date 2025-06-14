package com.springboot.thread.multithreads.executorframework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author prabhakar, @Date 29-12-2024
 */
public class RunnableTask implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Runnable runnable = () -> System.out.println("Hello It's Runnable");

        executorService.submit(runnable);
        //Future<?> submit = executorService.submit(runnable);

        Future<?> future = executorService.submit(runnable,"Success.");

        //System.out.println(submit.get());
        System.out.println(future.get());

        executorService.shutdown();
    }
}
