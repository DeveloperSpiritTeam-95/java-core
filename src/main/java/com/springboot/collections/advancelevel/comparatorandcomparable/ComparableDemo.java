package com.springboot.collections.advancelevel.comparatorandcomparable;

import java.util.ArrayList;
import java.util.List;

public class ComparableDemo {

    public static void main(String[] args) {

        List<Teacher> list = new ArrayList<>();

        list.add(new Teacher("Bob",45));
        list.add(new Teacher("Alice",24));
        list.add(new Teacher("Suresh",29));
        list.add(new Teacher("Kiran",32));
        list.add(new Teacher("Baby",27));

        // this is possible in natual numbers on order or comparator logic
        // in numbers list.sort(null); it will not through any error
        // but without implementation of Comparable to Generic custom class itself it will
        // after implementation of compareTo() successfully sorted in respective logic like -ve or +ve
        list.sort(null);

        System.out.println(list);
        System.out.println(list);
    }
}

class Teacher implements Comparable<Teacher>{

    private String name;
    private int age;
    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Teacher [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int compareTo(Teacher o) {
        return Double.compare(o.getAge(), this.getAge());
        //return o.getAge() - this.getAge();
        //return o.getName().compareTo(this.getName());
    }
}
