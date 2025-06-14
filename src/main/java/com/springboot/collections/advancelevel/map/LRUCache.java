package com.springboot.collections.advancelevel.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private int maxSize;

    public LRUCache(int maxSize) {
        super(maxSize, 0.75f, true);
        this.maxSize = maxSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > maxSize;
    }

    public static void main(String[] args) {

        LRUCache<String, Integer> studentMap = new LRUCache<>(3);

        studentMap.put("Arun", 91);
        studentMap.put("Bap", 52);
        studentMap.put("Charan", 93);
        System.out.println(studentMap);

        studentMap.put("Deva", 48);
        studentMap.put("Ram",99);

        System.out.println(studentMap);


    }
}
