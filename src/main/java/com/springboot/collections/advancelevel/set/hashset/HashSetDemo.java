package com.springboot.collections.advancelevel.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        // methods all are from collections methods like list

        set.add(4);
        set.add(5);
        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println("HashSet size: "+set.size());
        System.out.println("HashSet By default sorted: "+set);

        System.out.println(set.remove(45));
        System.out.println(set.isEmpty());

        System.out.println(set.contains(4));
        System.out.println(set.stream().max(Integer::compareTo).get());

        System.out.println(set.stream().limit(3).count());
        System.out.println(set.stream().reduce(0, Integer::sum));

        set.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

        set.clear();
        System.out.println(set.isEmpty());

        System.out.println("HashSet Completed.");

    }
}
