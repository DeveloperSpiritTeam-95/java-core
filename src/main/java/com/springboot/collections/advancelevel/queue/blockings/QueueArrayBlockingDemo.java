package com.springboot.collections.advancelevel.queue.blockings;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueArrayBlockingDemo {

    public static void main(String[] args) {

//        ArrayBlockingQueue is fixed size

        Queue<Integer> queue = new ArrayBlockingQueue<>(2);

        // we added size of elements using 2 differ methods
        queue.add(1);
        queue.offer(2);

        // list of elements
        System.out.println(queue);

        // remove element using 2 differ methods
        System.out.println(queue.poll());
        System.out.println(queue.remove());
        //System.out.println(queue.remove());     // it will disrupt the program via exception
        System.out.println(queue.poll());         // better to go with poll it will show null rather

        // checking the element added or not in boolean response
        System.out.println(queue.offer(3));
        System.out.println( queue.offer(4));


        // get head element using 2 differ methods
        System.out.println(queue.element());
        System.out.println(queue.peek());


        // list of elements
        System.out.println(queue);

    }
}
