package com.springboot.collections.advancelevel.map.concurrentmap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();

        // java 7 --> used in segment based locking --> by default 16 segments  --> smaller hashmaps

        // only the segment being written to read from is locked

        // read : do not require locking unless there is a write operation happening on the same segment
        // write: lock

        // java 8 --> no segmentation
        //        ==> Compare-And-Swap approach --> no locking except resizing or collision (in linked list)
        // Thread A last saw  --> x = 42
        // Thread A work --> x to 50
        // if x is still 42, then change it to 50 else don't change retry
        // put  --> index


        concurrentHashMap.put("one", 1);
        concurrentHashMap.put("two", 2);
        concurrentHashMap.put("three", 3);
        concurrentHashMap.put("four", 4);
        concurrentHashMap.put("five", 5);


        System.out.println(concurrentHashMap);

    }
}

