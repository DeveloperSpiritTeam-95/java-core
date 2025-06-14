package com.springboot.collections.advancelevel.map.linkedhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        // follows insertion order
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(); // double linked list

        // does not follow insertion order
//        HashMap<String,Integer> hashMap = new HashMap<>();

        linkedHashMap.put("Orange",20);
        linkedHashMap.put("Banana",30);
        linkedHashMap.put("Apple",40);
        linkedHashMap.put("Pear",50);
        linkedHashMap.put("Grape",60);
        //System.out.println(linkedHashMap);

        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("Parameters base example:");
        LinkedHashMap<String, Integer> linkedHashMap2 = new LinkedHashMap<>(11,0.8f,true);
        linkedHashMap2.put("Orange",20);
        linkedHashMap2.put("Banana",30);
        linkedHashMap2.put("Apple",40);
        linkedHashMap2.put("Pear",50);

        linkedHashMap2.get("Apple");
        linkedHashMap2.get("Banana");
        linkedHashMap2.get("Orange");

        //System.out.println(linkedHashMap2);
        for (Map.Entry<String, Integer> entry : linkedHashMap2.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
