package com.springboot.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceDemo {

    public static void main(String[] args) {

        // Method Reference --> use methods without invoking and in place of lambda expression
        // Method Reference indicates --> ::

        List<String> list = Arrays.asList("Ram", "Shyam", "Ganesh");
        list.forEach(System.out::println);

        // Constructor Reference
        List<String> names = Arrays.asList("A", "B", "C");
        //List<MyPhone> mobilPhoneList = names.stream().map(x -> new MyPhone(x)).collect(Collectors.toList());
        List<MyPhone> mobilPhoneList = names.stream().map(MyPhone::new).toList();

        mobilPhoneList.forEach(System.out::println);


    }
}

class MyPhone{
    String name;

    public MyPhone(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Phone: " + name;
    }

}
