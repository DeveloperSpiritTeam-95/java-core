package com.springboot.seniordev.captheorem;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
/**
 * @author prabhakar, @Date 20-03-2025
 */
// 1. AP System (Availability and Partition Tolerance) - Eventual Consistency
class APNode implements KeyValueStore {
    private Map<String, String> data = new HashMap<>();
    private String nodeId;

    public APNode(String nodeId) {
        this.nodeId = nodeId;
    }

    @Override
    public void put(String key, String value) {
        data.put(key, value);
        System.out.println("AP Node " + nodeId + ": Put " + key + " = " + value);
        // In a real AP system, this node would asynchronously propagate
        // the update to other nodes.  We're skipping that for simplicity.
    }

    @Override
    public Optional<String> get(String key) {
        System.out.println("AP Node " + nodeId + ": Get " + key);
        return Optional.ofNullable(data.get(key));
    }
}