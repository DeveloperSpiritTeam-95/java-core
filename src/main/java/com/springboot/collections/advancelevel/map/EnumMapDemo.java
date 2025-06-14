package com.springboot.collections.advancelevel.map;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class EnumMapDemo {

    public static void main(String[] args) {

        //Map<Day, String> map = new HashMap<>();
        // this is normal one, but we are working with enums

        Map<Day, String> map = new EnumMap<>(Day.class);

        /*
        array of size same as enum size
        [_,"Gym",_,_,_,_,_,_]
        no hashing here
        ordinal/index is used
        Faster than HashMap
        Memory Efficient

        */


        map.put(Day.WEDNESDAY, "Work");
        map.put(Day.THURSDAY, "Work");
        map.put(Day.MONDAY, "Gym");
        map.put(Day.TUESDAY, "Walk");
        map.put(Day.FRIDAY, "Run");
        map.put(Day.SATURDAY, "Sleep");
        map.put(Day.SUNDAY, "Sunday");

        System.out.println("Size: "+map.size());
        System.out.println(map.get(Day.WEDNESDAY));

        System.out.println(Day.MONDAY.ordinal());

        System.out.println("for loop values and keys: ");
        map.values().forEach(System.out::println);
        map.keySet().forEach(System.out::println);

        System.out.println("Entry: ");
        for (Map.Entry<Day, String> day : map.entrySet()) {
            System.out.println(day);
        }

        System.out.println(map);
    }
}

enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
