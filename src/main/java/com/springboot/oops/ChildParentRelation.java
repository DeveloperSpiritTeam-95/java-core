package com.springboot.oops;

public class ChildParentRelation {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        Parent obj = new Child();

        parent.show();
        System.out.println(Parent.greet());

        child.show();
        System.out.println(Child.greet());

        obj.show();
        System.out.println(obj.greet());
    }
}


class Child extends Parent{

    public static String greet(){
        return "Child Hello";
    }

    public void show(){
        System.out.println("Child.show");
    }
}


class Parent{
    public static String greet(){
        return "Parent Hello";
    }

    public void show(){
        System.out.println("Parent.show");
    }
}