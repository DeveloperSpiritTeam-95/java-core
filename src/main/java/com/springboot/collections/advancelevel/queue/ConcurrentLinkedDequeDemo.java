package com.springboot.collections.advancelevel.queue;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeDemo {

    public static void main(String[] args) {

        // non-blocking, thread-safe, double-ended queue
        // CAS ==> Compare and strategy

        ConcurrentLinkedDeque<String> concurrentLinkedDeque = new ConcurrentLinkedDeque<>();
        concurrentLinkedDeque.addFirst("Element first");
        concurrentLinkedDeque.addLast("Element second");
        concurrentLinkedDeque.addFirst("Element third");
        concurrentLinkedDeque.addLast("Element fourth");

        System.out.println(concurrentLinkedDeque);

        System.out.println(concurrentLinkedDeque.getFirst());
        System.out.println(concurrentLinkedDeque.getLast());

        System.out.println(concurrentLinkedDeque.removeFirst());
        System.out.println(concurrentLinkedDeque.removeLast());

        System.out.println(concurrentLinkedDeque);
    }
}
