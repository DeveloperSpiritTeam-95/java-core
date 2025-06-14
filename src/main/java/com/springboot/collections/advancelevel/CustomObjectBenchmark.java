package com.springboot.collections.advancelevel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author prabhakar, @Date 16-05-2025
 */

public class CustomObjectBenchmark {
    public static void main(String[] args) {
        int size = 100_000;
        List<Students> studentList = new ArrayList<>();
        Set<Students> studentSet = new HashSet<>();

        // Populating collections
        for (int i = 0; i < size; i++) {
            studentList.add(new Students(i, "Student" + i));
            studentSet.add(new Students(i, "Student" + i));
        }

        // Searching for a specific student
        Students searchStudent = new Students(size / 2, "Student" + (size / 2));

        long start = System.currentTimeMillis();
        boolean listFound = studentList.contains(searchStudent);
        long listSearchTime = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        boolean setFound = studentSet.contains(searchStudent);
        long setSearchTime = System.currentTimeMillis() - start;

        System.out.println("ArrayList search time: " + listSearchTime + " ms");
        System.out.println("HashSet search time: " + setSearchTime + " ms");
    }
}

