package com.springboot.seniordev.captheorem;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 * @author prabhakar, @Date 20-03-2025
 */
// 2. CP System (Consistency and Partition Tolerance) - Strong Consistency (using a simplified locking mechanism)
class CPNode implements KeyValueStore {
    private Map<String, String> data = new HashMap<>();
    private String nodeId;
    private Lock lock = new ReentrantLock(); // Simulate a distributed lock

    public CPNode(String nodeId) {
        this.nodeId = nodeId;
    }

    @Override
    public void put(String key, String value) {
        try {
            lock.lock(); // Attempt to acquire a lock (in a real system, this would be a distributed lock)
            data.put(key, value);
            System.out.println("CP Node " + nodeId + ": Put " + key + " = " + value);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public Optional<String> get(String key) {
        try {
            lock.lock(); // Attempt to acquire lock before reading
            System.out.println("CP Node " + nodeId + ": Get " + key);
            return Optional.ofNullable(data.get(key));
        } finally {
            lock.unlock();
        }
    }

      public boolean isLockAvailable() {
        return !((ReentrantLock) lock).isLocked();
    }
}