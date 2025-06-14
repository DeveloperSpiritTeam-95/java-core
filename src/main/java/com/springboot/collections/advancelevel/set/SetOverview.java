package com.springboot.collections.advancelevel.set;


import java.util.*;

public class SetOverview {

    public static void main(String[] args) {

        // Set is a collection that cannot contain duplicate elements.
        // It will follow internally HashMap principles.

        // Faster Operations:
        //      Map ==> HashMap, LinkedHashMap, TreeMap, EnumMap.
        //      Set ==> HashSet, LinkedHashSet, TreeSet, EnumSet.

       /*
       Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        System.out.println(map.keySet());
        Set<Integer> keySet = map.keySet();     // here keys are unique and not duplicate
        System.out.println(keySet);
        */

        Set<Integer> set = new HashSet<>();
        // methods all are from collections methods like list

        set.add(4);
        set.add(5);
        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println("HashSet size: "+set.size());
        System.out.println("HashSet By default sorted: "+set);


    }
}
