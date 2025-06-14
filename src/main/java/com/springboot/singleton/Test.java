package com.springboot.singleton;

/**
 * @author prabhakar, @Date 23-12-2024
 */
public class Test {

    public static void main(String[] args) {
        Student student = new Student();

        School.getInstance();
        School.getInstance();
        School.getInstance();

        // School school4 = new School();
        // 'School()' has private access in 'com.springboot.singleton.School'

        LazySingleton.getInstance();
        LazySingleton.getInstance();

        EagerSingleton.getInstance();
        EagerSingleton.getInstance();


        // EnumSingleton.INSTANCE.doSomething();
    }
}