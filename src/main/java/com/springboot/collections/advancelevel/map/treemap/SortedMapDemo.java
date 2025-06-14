package com.springboot.collections.advancelevel.map.treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {

    public static void main(String[] args) {

        //Map<String, Integer> map = new TreeMap<>();

        // sorted map ascending order by default
        SortedMap<String, Integer> map = new TreeMap<>();

        // sorted map descending order in the form of comparator but the key must integer
        //SortedMap<Integer, String> map = new TreeMap<>((a, b) -> b - a);

        map.put("Shubham", 3);
        map.put("Vivek", 2);
        map.put("Mohit", 4);
        map.put("Charan", 1);

        System.out.println(map);
        System.out.println("First and Last Key: ");
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());

        // below methods not follow sorting, follows insertion orders
        System.out.println("Head and Tail Map methods: ");
        System.out.println(map.headMap("Vivek"));
        System.out.println(map.tailMap("Vivek"));

        // from data to data inside the form key includes
        System.out.println("SubMaps: ");
        System.out.println(map.subMap("Mohit","Vivek"));
        System.out.println(map.subMap("Charan","Vivek"));

        System.out.println(map);

        //map.put(null,20);       // Demo example to show interviewer .NullPointerException

        // Time Complexity
        // O (log n) follows Red Black Tree (Self Balancing Binary search Tree)

        System.out.println(map.get("Charan"));
        System.out.println(map.containsKey("Charan"));
        System.out.println(map.containsValue(45));


        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        navigableMap.put(1, "Vivek");
        navigableMap.put(5, "Praveen");
        navigableMap.put(2, "Mohit");
        navigableMap.put(14, "Naresh");
        navigableMap.put(3, "Charan");


        System.out.println(navigableMap);
        System.out.println(navigableMap.lowerKey(3));
        System.out.println(navigableMap.higherKey(3));
        System.out.println(navigableMap.firstEntry());
        System.out.println(navigableMap.lastEntry());


        System.out.println(navigableMap.firstEntry().getKey());
        System.out.println(navigableMap.firstEntry().getValue());

        System.out.println(navigableMap.lastEntry().getKey());
        System.out.println(navigableMap.lastEntry().getValue());

        System.out.println(navigableMap.ceilingEntry(6));
        System.out.println(navigableMap.ceilingEntry(3));

        System.out.println(navigableMap);
        System.out.println(navigableMap.descendingMap());
    }
}
