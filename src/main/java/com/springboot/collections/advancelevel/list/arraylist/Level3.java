package com.springboot.collections.advancelevel.list.arraylist;

import java.lang.reflect.Array;
import java.util.*;

public class Level3 {

    public static void main(String[] args) {

        // Default constructor, creates an empty ArrayList with an initial capacity 10
        ArrayList<String> arrayList = new ArrayList<>();

        // creating an arraylist with a specified initial capacity
        ArrayList<String> listWithCapacity = new ArrayList<>(20);

        // creating an ArrayList from another collection
        List<String> anotherList = Arrays.asList("Apple","Banana","Carrot","Orange");
        ArrayList<String> listFromCollection = new ArrayList<>(anotherList);

        List<String> list = new ArrayList<>();

        System.out.println(list.getClass().getName());

        List<String> list1 = Arrays.asList("Monday", "Tuesday");

        System.out.println(list1.getClass().getName());

        list1.set(1, "Wednesday");
        System.out.println(list1.get(1));

        String[] array = {"Apple", "Banana", "Cherry"};

        List<String> list2 = Arrays.asList(array);

        System.out.println(list2.getClass().getName());

        List<String> list4 = new ArrayList<>(list2);
        list4.add("Mango");
        System.out.println(list4);


        List<Integer> list3 = List.of(1, 2, 3, 4); // immutable object
        // we can not add, set, remove the data we just read the data.
        //list3.set(1, 33);     //UnsupportedOperationException
        //list3.remove(2);
        System.out.println(list3);

        // list to Array
        Object[] array1 = list3.toArray();
        System.out.println(Arrays.toString(array1));

        //sorting ArrayList

        List<Integer> sortingList = Arrays.asList(7,1,8,5,2,3,4);

        System.out.println("level 1");
        // sorting sequence order
        sortingList.sort(null);
        System.out.println(sortingList);

        // reverse order
        sortingList.sort(Collections.reverseOrder());
        System.out.println(sortingList);

        System.out.println("level 2");
        // soring order using comparator in lambda expression
        sortingList.sort(Comparator.comparingInt(o -> o));
        System.out.println(sortingList);

        // reverse order using comparator in lambda expression
        sortingList.sort((o1, o2) -> o2 - o1);
        System.out.println(sortingList);

        System.out.println("level 3");
        Collections.sort(sortingList);
        System.out.println(sortingList);

        // make user defined reverse order logic outside the main method and call it.

    }
}
