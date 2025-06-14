package com.springboot.collections.advancelevel.list.vector;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>(4,3);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(45);

        System.out.println("Initial Capacity: "+vector.capacity());
        vector.add(3);
        System.out.println("After Capacity Increment: "+vector.capacity());

        System.out.println("Elements: "+vector);

        vector.add(2);
        vector.add(3);
        vector.add(45);
        System.out.println("After Capacity Increment: "+vector.capacity());

        // collection relate
        Vector<Integer> vector2 = new Vector<>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(vector2.capacity());

        // complete from another collection
        LinkedList<Integer> list = new LinkedList<>(vector2);
        Vector<Integer> vector3 = new Vector<>(list);
        System.out.println(vector3.capacity());


        /*
        Methods in Vector
        add(E e): Adds an element at the end

        add(int index, E element): insert an element at the specified index.

        get(int index): Retrieves the element at the specified index.

        set(int index, E element): Replace the element at the specified index.

        remove(Object o): Removes the first element at the specified element.

        remove(int index): Removes the element at the specified index.

        size(): Returns the number of elements in the vector.

        isEmpty(): Checks if the vector is empty.

        contains(Object o): Checks if the vector contain specified element.

        clear(): Removes all elements from the vector.

        */

        for (int i = 0; i < vector3.capacity(); i++) {
            System.out.println(vector3.get(i));
        }

        vector.clear();
        System.out.println(vector);
    }
}
