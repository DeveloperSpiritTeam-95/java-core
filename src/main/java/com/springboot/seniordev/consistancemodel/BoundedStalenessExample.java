package com.springboot.seniordev.consistancemodel;
/**
 * @author prabhakar, @Date 23-03-2025
 */
// Example Usage
public class BoundedStalenessExample {

    public static void main(String[] args) throws InterruptedException {
        BoundedStalenessCache<String, String> cache = new BoundedStalenessCache<>(5000); // 5 seconds max staleness

        cache.put("product1", "Name: Awesome Product, Price: $99");
        System.out.println("Initial get: " + cache.get("product1")); // Output: Optional[Name: Awesome Product, Price: $99]

        Thread.sleep(6000); // Wait longer than max staleness

        System.out.println("Stale get: " + cache.get("product1")); // Output: Optional.empty
    }
}