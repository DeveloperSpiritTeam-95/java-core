package com.springboot;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author prabhakar, @Date 04-07-2024
 */
public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello Welcome to Java world.");
        System.out.println("learn things.");

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);
        scheduler.schedule(
                () -> {
                    System.out.println("Initiating shutdown...");
                    scheduler.shutdown();
                }, 10, TimeUnit.SECONDS);

            scheduler.schedule(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Hello");
                }
            }, 4000, TimeUnit.MILLISECONDS);

        scheduler.schedule(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Hello");
            }
        }, 4000, TimeUnit.MILLISECONDS);

        scheduler.schedule(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Hello");
            }
        }, 4000, TimeUnit.MILLISECONDS);



        //scheduler.shutdown();
    }
}
