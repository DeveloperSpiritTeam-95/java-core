package com.springboot.collections.advancelevel.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Prabha");
        hashMap.put(2, "Sudha");
        hashMap.put(3, "Charan");
        hashMap.put(4, "Vijay");
        hashMap.put(5, "Kavya");

        System.out.println(hashMap);

        String student = hashMap.get(3);
        System.out.println(student);

        System.out.println(hashMap.containsKey(4));
        System.out.println(hashMap.containsValue(student));

        Set<Integer> keySet = hashMap.keySet();
        System.out.println(keySet);

        for (Integer integer : keySet) {
            System.out.println(hashMap.get(integer));
        }

        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry);
        }

        System.out.println(hashMap);
        hashMap.remove(2);
        System.out.println(hashMap);

    }
}
