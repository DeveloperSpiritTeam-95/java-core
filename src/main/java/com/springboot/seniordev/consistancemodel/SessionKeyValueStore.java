package com.springboot.seniordev.consistancemodel;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
/**
 * @author prabhakar, @Date 23-03-2025
 */
class SessionKeyValueStore {
    private  Map<String, String> data = new HashMap<>();
    private  ThreadLocal<Map<String, String>> sessionData = ThreadLocal.withInitial(HashMap::new);

    public void put(String key, String value) {
        sessionData.get().put(key, value); // Store in session-specific data
        data.put(key, value); // Also update the global data
    }

    public Optional<String> get(String key) {
        if (sessionData.get().containsKey(key)) {
            return Optional.of(sessionData.get().get(key)); // Read from session data first
        }
        return Optional.ofNullable(data.get(key)); // Then read from global data
    }

    // Example Usage (simulating a single-threaded session)
    public static void main(String[] args) {
        SessionKeyValueStore store = new SessionKeyValueStore();

        store.put("product1", "Initial Value");
        System.out.println("Read 1: " + store.get("product1")); // Read 1: Optional[Initial Value]

        store.put("product1", "Updated Value");
        System.out.println("Read 2: " + store.get("product1")); // Read 2: Optional[Updated Value] (Read Your Writes)

        // Simulate a different session (e.g., in a web application, a different request)
        ThreadLocal<Map<String, String>> otherSessionData = ThreadLocal.withInitial(HashMap::new);
        ThreadLocal<Map<String, String>> originalSessionData = store.sessionData;
        store.sessionData = otherSessionData; // Simulate different session

        System.out.println("Read 3 (different session): " + store.get("product1")); // Read 3 (different session): Optional[Initial Value] or Optional[Updated Value]

        store.sessionData = originalSessionData; // Restore original session
    }
}