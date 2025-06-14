package com.springboot.singleton;

/**
 * @author prabhakar, @Date 23-12-2024
 */
public class School {

    private static School instance;

    private School(){

    }

    // single ton object
    public static School getInstance(){
        if (instance == null){
            instance = new School();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("School.doSomething() called");
    }
}
