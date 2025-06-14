package com.springboot.collections.advancelevel.list.vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class CompleteDemo {

    public static void main(String[] args) {

        // thread not safe
        ArrayList<Integer> list = new ArrayList<>();
        // thread safe
        //Vector<Integer> list = new Vector<>();

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });

        thread.start();
        thread1.start();


        try {
            thread.join();
            thread1.join();

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Size of list: "+list.size());
    }
}
