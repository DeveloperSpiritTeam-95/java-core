package com.springboot.thread.multithreads.executorframework;

import java.util.concurrent.*;

/**
 * @author prabhakar, @Date 29-12-2024
 */
public class CallableTask implements Callable<Object> {
    @Override
    public Object call() throws Exception {
        Thread.sleep(1000);
        return 1;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(7);
        Callable<?> callable = () -> "HELLO It's Callable.";

        Future<?> obj = executorService.submit(callable);

        System.out.println(obj.get());

        if (obj.isDone()){
            System.out.println("Task is Done.");
        }

        executorService.shutdown();

    }

    public void sampleExample() throws ExecutionException, InterruptedException {
        Runnable runnable = new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(i+ " : Second Thread" + i);
                }
            }
        };

        Callable callable = () -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println(i+ " : Second Thread" + i);
            }
            return "Hello Callable Here";
        };

        System.out.println("Thread");
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<?> future = executorService.submit(callable);
        System.out.println(future.get());

        future = executorService.submit(runnable,"Hello Runnable Here");

        System.out.println(future.get());
        executorService.shutdown();

    }
}
