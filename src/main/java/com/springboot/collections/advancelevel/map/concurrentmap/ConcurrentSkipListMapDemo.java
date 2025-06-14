package com.springboot.collections.advancelevel.map.concurrentmap;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {

    /*
    1,2,3,4,5,6,7,8,9

    probabilistic data structure that allows for efficient search,
    insertion, and deletion operations.

    It is similar to a sorted linked list but with multiple layers
    that "skip" over portions of the list to provide faster access to elements.

    In SkipList:
        1. by default sorted data
        2. multiple layers (levels)
            level 1 : complete data
            level 2 : skip the elements alternatively
            level 3 : skip the more elements between first element, mid-element and last element

        3. fast access the data

    */


    public static void main(String[] args) {

        ConcurrentSkipListMap<String, Integer> map = new ConcurrentSkipListMap<>();

        map.put("key3", 12);
        map.put("key1", 23);
        map.put("key2", 34);


        System.out.println(map);



    }
}
