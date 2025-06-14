package com.springboot.seniordev.captheorem;

import java.util.Optional;
/**
 * @author prabhakar, @Date 20-03-2025
 */
interface KeyValueStore {
    void put(String key, String value);
    Optional<String> get(String key);
}

