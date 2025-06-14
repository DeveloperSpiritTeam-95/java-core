package com.springboot.singleton;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
        // Private constructor
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    // Example method
    public void doSomething() {
        System.out.println("LazySingleton.doSomething() called");
    }
}