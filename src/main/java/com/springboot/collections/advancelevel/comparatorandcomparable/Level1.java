package com.springboot.collections.advancelevel.comparatorandcomparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Level1 {

    public static void main(String[] args) {

        List<Plant> plants = new ArrayList<>();
        plants.add(new Plant("Alice",20,460));
        plants.add(new Plant("Bob",10,70));
        plants.add(new Plant("Charlie",27,60));
        plants.add(new Plant("David",12,560));
        plants.add(new Plant("Elijah",6,4600));
        plants.add(new Plant("Fred",2,600));
        plants.add(new Plant("Garfield",19,5060));
        plants.add(new Plant("Harry",70,34000));
        plants.add(new Plant("Jack",92,80000));

        System.out.println("Base on Price: ");
        plants.sort((a,b) -> (int) (a.getPrice() - b.getPrice()));

        for (Plant plant : plants) {
            System.out.println(plant);
        }

        System.out.println("Sort by price In Double.compare(): ");
        plants.sort((a,b) -> Double.compare(b.getPrice(), a.getPrice()));
        for (Plant plant : plants) {
            System.out.println(plant);
        }

        System.out.println("Base on Age: ");
        //plants.sort((a,b) -> (a.getAge() - b.getAge()));
        plants.sort(Comparator.comparingInt(Plant::getAge));
        for (Plant plant : plants) {
            System.out.println(plant);
        }

        System.out.println("Base on Name length: ");
        //plants.sort((a,b) -> (a.getName().length() - b.getName().length()));
        plants.sort(Comparator.comparingInt(a -> a.getName().length()));
        for (Plant plant : plants) {
            System.out.println(plant);
        }

        System.out.println("Base on Name: ");
        plants.sort(Comparator.comparing(Plant::getName));
        for (Plant plant : plants) {
            System.out.println(plant);
        }

    }
}

class Plant{
    private String name;
    private int age;
    private double price;

   public Plant(String name, int age, double price) {
       this.name = name;
       this.age = age;
       this.price = price;
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
   public double getPrice() {
       return price;
   }
   public void setPrice(double price) {
       this.price = price;
   }

   public String toString() {
       return "Plant [name=" + name + ", age=" + age + ", price=" + price + "]";
   }
}