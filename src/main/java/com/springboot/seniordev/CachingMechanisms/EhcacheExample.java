//package com.springboot.seniordev.CachingMechanisms;
//
//import org.apache.kafka.common.cache.Cache;
//import org.springframework.cache.CacheManager;
//
///**
// * @author prabhakar, @Date 28-03-2025
// */
//
//public class EhcacheExample {
//    public static void main(String[] args) {
//        // Create a cache manager
//        CacheManager cacheManager = CacheManagerBuilder.newCacheManagerBuilder()
//                .withCache("myCache",
//                        CacheConfigurationBuilder.newCacheConfigurationBuilder(Long.class, String.class,
//                                        ResourcePoolsBuilder.heap(100)) // 100 entries max
//                                .build())
//                .build(true);
//
//        // Get the cache
//        Cache<Long, String> myCache = cacheManager.getCache("myCache", Long.class, String.class);
//
//        // Put a key-value pair in the cache
//        myCache.put(1L, "myValue");
//
//        // Get the value by key
//        String value = myCache.get(1L);
//        System.out.println("Value: " + value); // Output: Value: myValue
//
//        // Close the cache manager
//        cacheManager.close();
//    }
//}
