package com.springboot.collections.advancelevel.list.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedListExample {

    public static void main(String[] args) {
/*
        // practical example on nodes

        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();

        node1.value = 1;
        node1.next = null;

        node2.value = 1;
        node2.next = node1;
        node2.next = null;
*/
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(6);

        System.out.println(" -=====-");
        System.out.println(list.stream()
                .filter(element -> list.indexOf(element) != list.lastIndexOf(element))
                .distinct()
                .toList());


        System.out.println(list);
        System.out.println(list.size());
        list.addLast(23);
        System.out.println(list.get(0));
        list.addLast(33);
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println(list);

        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

        list.removeIf(x -> x % 2 ==0 );
        System.out.println(list);



    }
}
