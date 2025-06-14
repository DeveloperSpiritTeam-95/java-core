package com.springboot.collections.advancelevel.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6);
        System.out.println("Normal Map: " + map);

        /*
        Returns an unmodifiable view of the specified map. Query operations on the returned map
        "read through" to the specified map, and attempts to modify the returned map, whether
        direct or via its collection views, result in an UnsupportedOperationException.
        */

        Map<String, Integer> map1 = Collections.unmodifiableMap(map);
        System.out.println("Unmodifiable Map: " + map1);
        //map1.put("A", 1);       // UnsupportedOperationException
        //System.out.println("Modified Unmodifiable Map: "+map1);

        // we can put only 10 entries key values using Map.of(); this is the limit

        Map<String, Integer> map2 = Map.of("Vivek", 34, "sanketh", 99, "pranay", 67, "prabha", 50);
        System.out.println("UnModified Map: " + map2);
        //map2.put("kiran", 34);  // UnsupportedOperationException
        //System.out.println("Modified Unmodifiable Map: "+map2);

        // here we can insert infinite entries this is the advantage.
        Map<String, Integer> map3 = Map.ofEntries(Map.entry("Keerthi", 99), Map.entry("Suheena", 50), Map.entry("Priyanka", 89));
        System.out.println("UnModified Map: " + map3);

        //map3.put("Gayathri",78);
        //System.out.println("Modified Map: " + map3);


    }
}
