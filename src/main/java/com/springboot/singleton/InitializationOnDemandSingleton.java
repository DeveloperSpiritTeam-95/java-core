package com.springboot.singleton;

public class InitializationOnDemandSingleton {

    private InitializationOnDemandSingleton() {
        // Private constructor
    }

    private static class InstanceHolder {
        private static final InitializationOnDemandSingleton instance = new InitializationOnDemandSingleton();
    }

    public static InitializationOnDemandSingleton getInstance() {
        return InstanceHolder.instance;
    }

    // Example method
    public void doSomething() {
        System.out.println("InitializationOnDemandSingleton.doSomething() called");
    }
}