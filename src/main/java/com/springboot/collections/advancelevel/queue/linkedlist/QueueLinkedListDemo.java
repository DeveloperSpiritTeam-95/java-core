package com.springboot.collections.advancelevel.queue.linkedlist;

import java.util.LinkedList;

public class QueueLinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // the methods functionality same but the responsibility and error handling is different

        // This linked list acting as Queue because one of the implementation class is LinkedList.

        list.addLast(1);        // enqueue in linked list
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);        // addLast and offer by default add the element at the end
        list.offer(45);
        System.out.println(list);
        list.addFirst(9);       // we specify the position at first.


        System.out.println(list);      // list of elements after adding enqueue form

        System.out.println(list.removeFirst());     // dequeue
        System.out.println(list);

        // dequeue        throws an exception
        /*
        System.out.println(list.remove());
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        */

        // given null values rather on exception.

        System.out.println(list.poll());
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());

        System.out.println(list);       // list of elements after removing dequeue form

        // throws exception
        /*
        System.out.println(list.get(0));
        System.out.println(list.getFirst());        // peek     this is normal not a comparison
        System.out.println(list.getLast());
        */

        // given null values rather on exception.

        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
    }
}
