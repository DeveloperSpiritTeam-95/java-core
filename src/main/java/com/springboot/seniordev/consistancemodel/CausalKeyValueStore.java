package com.springboot.seniordev.consistancemodel;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
/**
 * @author prabhakar, @Date 23-03-2025
 */
public class CausalKeyValueStore {
    private final Map<String, String> data = new HashMap<>();
    private final Map<UUID, Map<String, String>> causalHistory = new HashMap<>();

    private UUID clientId = UUID.randomUUID();

    public void put(String key, String value) {
        Map<String, String> clientHistory = causalHistory.computeIfAbsent(clientId, k -> new HashMap<>());
        clientHistory.put(key, value);
        data.put(key, value); // Apply the write
    }

    public String get(String key) {
        // Get the client's history
        Map<String, String> clientHistory = causalHistory.get(clientId);
        if (clientHistory != null && clientHistory.containsKey(key)) {
            return clientHistory.get(key); // Return value from client's history
        }
        return data.get(key); // Return the latest value
    }

    // Example Usage
    public static void main(String[] args) {
        CausalKeyValueStore store1 = new CausalKeyValueStore();
        CausalKeyValueStore store2 = new CausalKeyValueStore();

        // Client 1 writes
        store1.put("key1", "value1");
        String value1 = store1.get("key1");
        System.out.println("Client 1 read: " + value1); // Client 1 read: value1

        // Client 1's write is causally related to Client 2's read
        store2.put("key1", "value1");
        String value2 = store2.get("key1");
        System.out.println("Client 2 read: " + value2); // Client 2 read: value1

        // Client 2 writes, causally related to Client 1's write
        store2.put("key2", value2 + " modified");
        System.out.println("Client 2 read: " + store2.get("key2")); // Client 2 read: value1 modified
    }
}
