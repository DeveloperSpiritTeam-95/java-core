//package com.springboot.seniordev.CachingMechanisms;
//
//import java.net.InetSocketAddress;
//
///**
// * @author prabhakar, @Date 28-03-2025
// */
//
//public class MemcachedExample {
//
//    public static void main(String[] args) throws Exception {
//        // Connect to Memcached server
//        MemcachedClient mc = new MemcachedClient(new InetSocketAddress("localhost", 11211));
//
//        // Set a key-value pair
//        mc.set("myKey", 60, "myValue"); // 60 seconds expiration
//
//        // Get the value by key
//        String value = (String) mc.get("myKey");
//        System.out.println("Value: " + value); // Output: Value: myValue
//
//        // Close the connection
//        mc.shutdown();
//    }
//}
