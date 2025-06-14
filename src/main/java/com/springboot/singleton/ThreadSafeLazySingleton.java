package com.springboot.singleton;

public class ThreadSafeLazySingleton {
    private static ThreadSafeLazySingleton instance;

    private ThreadSafeLazySingleton() {
        // Private constructor
    }

    public static synchronized ThreadSafeLazySingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLazySingleton();
        }
        return instance;
    }

    // Example method
    public void doSomething() {
        System.out.println("ThreadSafeLazySingleton.doSomething() called");
    }
}