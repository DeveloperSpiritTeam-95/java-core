package com.springboot.collections.advancelevel.list.arraylist;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Level2 {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(11);

        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);

        System.out.println(arrayList.size());

        try {

            Field field = ArrayList.class.getDeclaredField("elementData");
            field.setAccessible(true);      // This will fail without --add-opens
            Object[] elementData = (Object[]) field.get(arrayList);
            System.out.println(elementData.length);
        }catch (Exception e){
            e.printStackTrace();
        }



    }

    /*
    ==>
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        System.out.println(arrayList);

    ==>
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);
        System.out.println(arrayList);

    */
}
