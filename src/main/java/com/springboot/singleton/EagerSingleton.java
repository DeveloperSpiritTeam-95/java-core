package com.springboot.singleton;

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        // Private constructor to prevent external instantiation
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    // Example method
    public void doSomething() {
        System.out.println("EagerSingleton.doSomething() called");
    }
}