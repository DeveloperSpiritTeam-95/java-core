package com.springboot.collections.advancelevel.queue.dequeue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ArrayDequeDemo {

    // pronunciation is deq (double ended queue)
    // no thread safe

    public static void main(String[] args) {

        // double-ended queue
        // allow insertion and removal of elements from both ends
        // versatile than regular queue and stacks because they support all the operations of both


        /*
        INSERTION METHODS

        addFirst(E e);      Inserts the specified element at the front
        addLast(E e);       Inserts the specified element at the end
        offerFirst(E e);    Inserts the specified element at the front if possible
        offerLast(E e);     Inserts the specified element at the end if possible

        */


        /*
        REMOVAL METHODS

        removeFirst();      Retrieves and removes the first element.
        removeLast();       Retrieves and removes the last element.
        pollFirst();        Retrieves and removes the first element, or returns null if empty.
        pollLast();         Retrieves and removes the Last element, or returns null if empty.

        */

        /*
        EXAMINATION METHODS

        getFirst();         Retrieves, but does not remove, the first element.
        getLast();          Retrieves, but does not remove, the last element.
        peekFirst();        Retrieves, but does not remove, the first element, or returns null if empty.
        peekLast();         Retrieves, but does not remove, the last element, or returns null if empty.

        */

        /*
        STACK METHODS

        push(E e);          Adds an element at the front (equivalent or addFirst(E e)).
        pop();              Removes and returns the first elements (equivalent removeFirst()).

        */


        // Queue is faster iteration because of internally follows
        // Array principle (contiguous memory allocation)

        // low memory, no pointers, no more nodes, no null allowed
        // quick access because of array follows index base retrieval

        // faster than stack

        /*
        ArrayDeque class is likely to be faster than Stack when used as a stack,
        and faster than LinkedList when used as a queue.
        */

        Deque<Integer> deque1 = new ArrayDeque<>();

        // circular array, head and tail
        deque1.add(23);
        deque1.addFirst(45);
        deque1.addLast(56);
        deque1.offer(78);
        deque1.offerFirst(90);
        deque1.offerLast(50);

        // 90, 45, 23, 56, 78, 50
        System.out.println(deque1);

        // retrieves the first and last elements
        System.out.println("First Element: " + deque1.getFirst());
        System.out.println("Last Element: " + deque1.getLast());

        // removes the first element two times
        System.out.println("Removes First Element: "+ deque1.removeFirst());   // Removes 90
        System.out.println("Poll First Element: "+ deque1.pollFirst());     // Removes 45

        // 23, 56, 78, 50
        System.out.println(deque1);

        // retrieves the first and last elements
        System.out.println("Peek Element: " + deque1.peek());
        System.out.println("Peek First Element: " + deque1.peekFirst());
        System.out.println("Peek Last Element: " + deque1.peekLast());

        // 23, 56, 78, 50
        System.out.println(deque1);


        // removes the first element two times
        System.out.println("Removes Last Element: "+ deque1.removeLast());
        System.out.println("Poll Last Element: " + deque1.pollLast());

        // retries the elements in respective manner
        System.out.println("Get First Element: " + deque1.getFirst());
        System.out.println("Get Last Element: " + deque1.getLast());

        System.out.println("Peek First Element: " + deque1.peekFirst());
        System.out.println("Peek Last Element: " + deque1.peekLast());

        // 23, 56
        System.out.println(deque1);

    }
}
