package com.springboot.collections.advancelevel.set.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        // ordered
        Set<Integer> set = new LinkedHashSet<>();
        set.add(4);
        set.add(5);
        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println("LinkedHashSet size: "+set.size());
        System.out.println("LinkedHashSet By default not sort: "+set);

        System.out.println(set.remove(5));
        System.out.println(set.isEmpty());

        System.out.println(set.contains(11));
        System.out.println(set.stream().min(Integer::compareTo).get());

        System.out.println(set.stream().limit(3).sorted());
        System.out.println(set.stream().reduce(0, Integer::sum));

        set.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

        set.clear();
        System.out.println(set.isEmpty());

        System.out.println("LinkedHashSet Completed.");
    }
}
