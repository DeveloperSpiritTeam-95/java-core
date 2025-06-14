package com.springboot.collections.advancelevel.list.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Level1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        list.add("I");
        list.add("J");

        System.out.println("List Data: "+list);

        System.out.println("for loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("for-each loop");
        for (String i: list){
            System.out.println(i);
        }

        System.out.println("iterator");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("streams API");
        Stream<String> stream = list.stream();
        stream.forEach(v -> System.out.println(v));

        System.out.println("streams Method reference");
        Stream<String> stream2 = list.stream();
        stream2.forEach(System.out::println);

        System.out.println("Using Collector");
        System.out.println(list.stream().collect(Collectors.toList()));

        System.out.println("Using Collector 2");
        System.out.println(list.stream().collect(Collectors.joining(",")));

        System.out.println("Using Collector 3");
        System.out.println(list.stream().collect(Collectors.joining(",", "[", "]")));

        System.out.println("Using List Iterator");
        System.out.println(list.stream().iterator());

        System.out.println("List Size: "+list.size());
        System.out.println("First Element: "+list.get(0));
        System.out.println("First Element: "+list.get(0));
        System.out.println("Last Element: "+list.get(list.size()-1));

        System.out.println("Element Contains: "+list.contains("A"));
        System.out.println("Element Contains: "+list.contains("B"));
        list.remove("A");
        System.out.println("Remove A: "+list);
       list.add(0,"Z");
        System.out.println("Add Z: "+list);

        list.set(3,"Y");
        System.out.println("Add Y: "+list);


    }
}
