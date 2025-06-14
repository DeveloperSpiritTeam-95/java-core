package com.springboot.collections.advancelevel.comparatorandcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Level2 {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Prabhakar", 9.3));
        students.add(new Student("Kavitha", 3));
        students.add(new Student("charan", 7.3));
        students.add(new Student("Mohan", 5));
        students.add(new Student("Mary", 4.5));
        students.add(new Student("Lawrence", 2.8));
        students.add(new Student("praveen", 9.0));
        students.add(new Student("Amrutha", 7.4));

        /*
        These Both lambda expression works on only int accurate values not with fractional
        Ascending order
        students.sort(((o1, o2) -> (int) (o1.getScore() - o2.getScore())));
        Descending order
        students.sort(((o1, o2) -> (int) (o2.getScore() - o1.getScore())));

        so we can achieve like below
        */

        /*
        // for Ascending order

        students.sort(((o1, o2) -> {
            if (o1.getScore() > o2.getScore())
                return 1;
            else if (o1.getScore() < o2.getScore())
                return -1;
            else
                return 0;
        }));
        */

        /*
        // for Descending order

        students.sort(((o1, o2) -> {
            if (o1.getScore() < o2.getScore())
                return 1;
            else if (o1.getScore() > o2.getScore())
                return -1;
            else
                return 0;
        }));
        */

        // Ascending
        //Comparator<Student> comparing = Comparator.comparing(Student::getScore);

        // Descending
        //Comparator<Student> comparing = Comparator.comparing(Student::getScore).reversed();

        // By default, Ascending order first compare with score then with name
        Comparator<Student> comparing = Comparator.comparing(Student::getScore)
                .thenComparing(Student::getName);
        students.sort(comparing);

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println(" Lexicographic order");
        // Lexicographic order, also known as dictionary or lexical order, is a way to
        // compare sequences of elements by examining them from beginning to end
        // It's a generalization of alphabetical order, which is used to sort words
        // in a dictionary.

        students.sort(((o1, o2) -> {
            if (o1.getScore() > o2.getScore())
                return 1;
            else if (o1.getScore() < o2.getScore())
                return -1;
            else
                return o1.getName().compareTo(o2.getName());    // Lexicographic order here
        }));

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("Using Collections.sort");
        // directly we can sort the data using Collections
        Comparator<Student> comparator = Comparator.comparing(Student::getScore)
                .thenComparing(Student::getName);

        Collections.sort(students, comparator);
        for (Student student : students) {
            System.out.println(student);
        }
    }

}

class Student {
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String toString() {
        return "Student [name=" + name + ", score=" + score + "]";
    }
}

