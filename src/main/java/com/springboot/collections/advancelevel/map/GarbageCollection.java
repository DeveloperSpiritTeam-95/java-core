package com.springboot.collections.advancelevel.map;

import java.lang.ref.WeakReference;

public class GarbageCollection {

    public static void main(String[] args) {

        Phone phone = new Phone("Black", "16 pro max", "Apple");
        Phone phone1 = new Phone("White", "Oppo 15", "Oppo");
        Phone phone2 = new Phone("Red", "16 plus", "Apple");
        Phone phone3 = new Phone("Orange", " real MI 16", "RealMI");

        System.out.println(phone);
        phone = null;       // remove above memory on the phone pointer reference
        //Runs the garbage collector in the Java Virtual Machine.
        //Calling the gc method suggests that the Java Virtual Machine expend effort toward
        // recycling unused objects in order to make the memory they currently occupy available
        // for reuse by the Java Virtual Machine. When control returns from the method call,
        // the Java Virtual Machine has made a best effort to reclaim space from all unused objects.

        //System.gc();
        //Runtime.getRuntime().gc();

        System.out.println(phone);
        System.out.println(phone1);
        phone1 = null;      // remove above memory on the phone1 pointer reference

        System.out.println(phone2);
        phone2 = null;      // remove above memory on the phone2 pointer reference
        System.out.println(phone3);

        //like above jvm cleans the memory in the process of garbage collection
        // it will collect un used reference as well garbage un usage data for pointing.

        // this is referring StrongReference because phone3 pointing till now
        //WeakReference<Phone> phoneRef = new WeakReference<>(phone3);

        // this is referring WeakReference
        WeakReference<Phone> phoneRef = new WeakReference<>(new Phone("Black", "16 pro max", "Apple"));
        System.out.println("Weak Reference: " + phoneRef.get());
        // don't do in production or test environments
        // this is for demo regards

        System.gc();        // JVM doing internally. no need to mention.
        // we are telling to JVM clean the data which is used in WeakReference for demo purpose
        // JVM cleans the data. the output pointing at null value.

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Weak Reference After sleep: " + phoneRef.get());

    }

}

class Phone {

    String color;
    String name;
    String brand;

    public Phone(String color, String name, String brand) {
        this.color = color;
        this.name = name;
        this.brand = brand;
    }

    public String toString() {
        return color + " " + name + " " + brand;
    }

}
