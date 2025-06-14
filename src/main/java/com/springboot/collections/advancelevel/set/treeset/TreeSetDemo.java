package com.springboot.collections.advancelevel.set.treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();
        // NavigableSet<Integer> set = new TreeSet<>();
        //SortedSet<Integer> set = new TreeSet<>();

        set.add(4);
        set.add(5);
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println("TreeSet size: "+set.size());
        System.out.println("TreeSet By default not sort: "+set);

        System.out.println(set.contains(4));
        System.out.println(set.remove(5));
        set.clear();
        System.out.println("LinkedHashSet size: "+set.size());
        System.out.println(set.isEmpty());

        for (int value : set) {
            System.out.println(value);
        }



    }
}
