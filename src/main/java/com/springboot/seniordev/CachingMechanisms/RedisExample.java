//package com.springboot.seniordev.CachingMechanisms;
//import redis.clients.jedis.Jedis;
///**
// * @author prabhakar, @Date 28-03-2025
// */
//// Jedis (Java client for Redis) example
//
//public class RedisExample {
//    public static void main(String[] args) {
//        // Connect to Redis server
//        Jedis jedis = new Jedis("localhost", 6379);
//
//        // Set a key-value pair
//        jedis.set("myKey", "myValue");
//
//        // Get the value by key
//        String value = jedis.get("myKey");
//        System.out.println("Value: " + value); // Output: Value: myValue
//
//        // Close the connection
//        jedis.close();
//    }
//}
