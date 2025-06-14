package com.springboot.collections.advancelevel.comparatorandcomparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {

        // Comparator is a functional interface

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2)
                    return o1;
                return o2;
            }
        };
        System.out.println(comparator.compare(1, 2));
        System.out.println(comparator.compare(2, 3));

        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(130);
        list.add(7);
        list.add(46);
        list.add(-13);

        System.out.println(list);
        list.sort(new MYNumberComparator());
        System.out.println(list);

        List<String> fruits = Arrays.asList("Oran", "Watermelon", "Apple", "Ban");
        System.out.println(fruits);
        fruits.sort(new MyStringComparator());
        //or

        // Ascending order
        //fruits.sort((o1, o2) -> o1.length() - o2.length());
        // or
        fruits.sort(Comparator.comparingInt(String::length));

        // Descending order
        //fruits.sort((o1, o2) -> o2.length() - o1.length());
        // or
        //fruits.sort(Comparator.comparingInt(String::length).reversed());

        System.out.println(fruits);

    }


}

class MyStringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        // Ascending order
        //return o1.length() - o2.length();
        // Descending order
        return o2.length() - o1.length();
    }
}

class MYNumberComparator implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        // returns negative values sorting order
        // -13,-2,4,17,25,70
        //return o1 - o2;

        // returns positive values with descending order
        // 70, 25, 17, 4, -2, -13
        return o2 - o1;
    }
}
