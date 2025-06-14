package com.springboot.collections.advancelevel.map;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

    /*
            Hash table based implementation of the Map interface, with weak keys.
            An entry in a WeakHashMap will automatically be removed when its key
            is no longer in ordinary use. More precisely, the presence of a mapping
            for a given key will not prevent the key from being discarded by the garbage
            collector, that is, made finalizable, finalized, and then reclaimed
    */

    public static void main(String[] args) {

        WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
        // keys are strong reference means String literals alive in pool area this called
        // Strong Reference
        // you cant to made week reference in poll are for Garbage collection
        // take it as a new memory location. like new String("image1")

        loadCache(imageCache); // Strong reference scope itself method only

        imageCache.put(new String("image1"), new Image("image1.gif"));
        imageCache.put(new String("image2"), new Image("image2.gif"));
        imageCache.put(new String("image3"), new Image("image3.gif"));
        System.out.println(imageCache);

        simulateApplicationRunning();

        System.gc();        // it will clean the weakReference keys and values

        System.out.println("Cache after running (some entries may be cleaned): " + imageCache);

    }

    public static void loadCache(Map<String, Image> imageCache) {
        String k1 = new String("image1");
        String k2 = new String("image2");
        imageCache.put(k1, new Image("image1.gif"));
        imageCache.put(k2, new Image("image2.gif"));
        System.out.println(imageCache);
    }

    private static void simulateApplicationRunning() {
        try {
            System.out.println("Simulating application running...");
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Image {

    private String name;

    public Image(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}