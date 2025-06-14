package com.springboot.collections.advancelevel.map.hashmap;

import java.util.HashMap;

public class Level1 {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(5,"E");
        map.put(6,"F");

        System.out.println(map);

        // hash function
        System.out.println(simpleHash("raabhkarP"));
        System.out.println(simpleHash("rabPhakar"));

        System.out.println("Handling Collision: ");
        HashMap<String,Integer> fruits = new HashMap<>();
        fruits.put("apple",1);
        fruits.put("orange",2);
        fruits.put("banana",3);
        fruits.put("pear",4);
        System.out.println(fruits);

        // let say "apple" and "orange" end up in the same bucket due to hash collision.
        // They will be stored in a linked list in the bucket:

        // Bucket 5: ("apple", 1) -> ("orange", 2)

        // when we do map.get("orange"), HashMap will go to bucket 5 and then traverse the
        // linked list to find the entry with the key "orange".

    }

    public static int simpleHash(String key){
        int hash = 0;
        for (char c : key.toCharArray()) {
            hash += (int) c;
        }
        return hash % 10;
    }
}
