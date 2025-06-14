package com.springboot.collections.advancelevel.queue.blockings;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueDemo {

    public static void main(String[] args) {

        // Creates a SynchronousQueue with non-fair access policy.
        BlockingQueue<String> queue = new SynchronousQueue<>();

        // each insert operation must wait for a corresponding remove operation by another
        // thread and vice versa
        // it can not store elements, capacity of at most one element

        Thread producer = new Thread(() -> {
            try {
                System.out.println("Producer is waiting for transfer....");
                queue.put("Hello From Producer");
                System.out.println("Producer has transferred the message..");
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
                System.out.println("Producer was interrupted: "+e.getMessage());
            }
        });


        Thread consumer = new Thread(() -> {
            try {
                System.out.println("Consumer is waiting for receive....");
                String result = queue.take();
                System.out.println("Consumer has received: "+result);

            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
                System.out.println("Consumer was interrupted: "+e.getMessage());
            }
        });

        producer.start();
        consumer.start();


    }
}
