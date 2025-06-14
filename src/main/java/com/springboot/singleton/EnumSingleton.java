package com.springboot.singleton;

public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("EnumSingleton.doSomething() called");
    }
}