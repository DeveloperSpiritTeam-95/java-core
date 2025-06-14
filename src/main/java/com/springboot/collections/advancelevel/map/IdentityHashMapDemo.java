package com.springboot.collections.advancelevel.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

    public static void main(String[] args) {

        String key1 = new String("key");    // 1 index it will not happen but assume it
        String key2 = new String("key");    // 1 index

        //Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map = new IdentityHashMap<>();
        // hashcode and equals
        // IdentityHashMap and ==
        
        // identity hashcode differ
        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));

        // these hashcode same
        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());
        map.put(key1, 1);   //key, 1
        map.put(key2, 2);   //key, 2

        // equals checks with help of equals()
        System.out.println(key1.equals(key2));

        System.out.println(map);



    }
}
