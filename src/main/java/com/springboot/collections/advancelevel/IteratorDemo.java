package com.springboot.collections.advancelevel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        //List<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        /*for (Integer i : list) {
            System.out.println(i);
            if (i % 2 == 0) {       // ConcurrentModificationException if you use ArrayList
                list.remove(i);
            }
        }*/

        System.out.println("Iterator: ");

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            Integer num = iterator.next();
            if (num % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println(list.size());
        System.out.println(list);

        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            listIterator.set(listIterator.next());
        }
        System.out.println(list);

    }
}
