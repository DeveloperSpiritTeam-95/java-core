package com.springboot.seniordev.consistancemodel;

import java.time.Instant;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/**
 * @author prabhakar, @Date 23-03-2025
 */
public class BoundedStalenessCache<K, V> {
    private final ConcurrentMap<K, StaleValue<V>> cache = new ConcurrentHashMap<>();
    private final long maxStalenessMillis;

    public BoundedStalenessCache(long maxStalenessMillis) {
        this.maxStalenessMillis = maxStalenessMillis;
    }

    public void put(K key, V value) {
        cache.put(key, new StaleValue<>(value));
    }

    public Optional<V> get(K key) {
        StaleValue<V> staleValue = cache.get(key);
        if (staleValue != null && !staleValue.isStale(maxStalenessMillis)) {
            return Optional.of(staleValue.getValue());
        }
        return Optional.empty(); // Value is stale or not found
    }

    private static class StaleValue<V> {
        private final V value;
        private final Instant timestamp;

        public StaleValue(V value) {
            this.value = value;
            this.timestamp = Instant.now();
        }

        public V getValue() {
            return value;
        }

        public boolean isStale(long maxStalenessMillis) {
            return timestamp.plusMillis(maxStalenessMillis).isBefore(Instant.now());
        }
    }
}