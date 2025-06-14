package com.springboot.context;

/**
 * @author prabhakar, @Date 06-03-2025
 */

public class OOPS {

    /*
        OOPS: Object-Oriented Programming Language
        A Programming paradigm that uses objects and classes to design and implements software solutions.

        Key Concepts of OOPS in Java
        1. Class
        2. Object
        3. Abstraction
        4. Encapsulation
        5. Polymorphism
        6. Inheritance



        Class:
            A class is a blueprint for creating objects.
            It defines that structure (fields) and behaviour (methods) of objects.
          Ex:
          class Car{
              String color;
              int speed;

              void drive(){
                  System.out.println("Car is driving");
              }
          }



        Object:
            An object is an instance of a class. It represents a real-world entity and
            it has attributes and behaviors.
         Ex:
          Car car = new Car();
          car.color = "Red";
          car.drive();



        Abstraction:
            Abstraction focuses on showing only essential details while hiding the implementation.
            It is achieved through abstract classes and interfaces.

        Abstract Class:
            Declared using the abstract keyword.
            Can include both abstract methods (methods without a body) and
            concrete methods (methods with a body).
            Cannot be instantiated directly.
            Acts as a blueprint for subclasses, which must implement the abstract methods.

         Ex:
          public class Test {
            public static void main(String[] args) {
            Animal bob = new Dog(); Animal bobyy = new Cat();
            bob.sayBye();
            bobyy.sayBye();
            bob.sleeер();
            bobyy.sleep();
           }
          }

          abstract class Animal{
            public abstract void sayHello();
            public abstract void sayBye();
            public void sleep(){
            System.out.println("zzzzz...");
            }
           }
           class Dog extends Animal{
            public void sayHello() {
            System.out.println("Woof");
            }
            public void sayBye() {
            System.out.println("Woof Woof");
            }
           }
           class Cat extends Animal{
            public void sayHello() {
            System.out.println("Meow");
            }
            public void sayBye() {
            System.out.println("Meow Meow");
            }
          }


        Encapsulation:
            Encapsulation is the practice of bundling data(fields) and methods (functions) that
            operate on the data into a single unit (class). It also involves restricting direct
            access to some components using access modifiers (e.g., private, protected).
         Ex:
          class Employee {
              private String name;
              private int salary;

              public String getName() }
                return name;
              }
              public void setName(String name)
                this.name = name;
              }
            }


        Inheritance:
            Inheritance allows a class to acquire properties and methods of another class.
            It supports code reusability.
          Ex:
           class Animal {
             void eat() {
                System.out.println("This animal eats food.");
             }
            }
            class Dog extends Animal {
             void bark( ) {
                System.out.println("Dog barks.");
             }
            }

         Inheritance:
            Single
            Multilevel
            Hierarchical
            Java Doesn't support Multiple inheritance

         Polymorphism:
            Polymorphism allows methods to perform different tasks
            based on the object that calls them.
            It can be achieved via:
                Runtime Polymorphism (Method Overriding)
                Compile-time Polymorphism (Method Overloading)

            Method overloading: (Compile-Time Polymorphism)
                Method Overloading in Java is a feature that allows a class
                to have multiple methods with the same name but different
                parameter lists. It enables a method to perform different
                tasks depending on the arguments passed to it.
            Ex:
            Different Number of Parameters

            class Calculator{
              // Add two integers
              int add(int a, int b) {
                return a + b;
              }
              // Add three integers
              int add(int a, int b, int c) {
                return a+b+ c;
              }
            }

            public class Main {
                public static void main(String[] args){
                Calculator calc = new Calculator();
                System.out.println(calc.add(2, 3));          // Output: 5
                System.out.println(calc.add(1, 2, 3));       // Output: 6
             }
            }

            Different Types of Parameters
            class Printer {
               void print(String s) {
                System.out.println("String:"+s);
               }
               void print(int num) {
                System.out.println("Integer:" +num);
               }
               void print(double d) {
                System.out.println("Double: " + d);
               }
             }

             Different Order of Parameters
             class Display {
                void show(String s, int num) {
                System.out.println("String: " +s + ", Number: " + num);
                }
                void show(int num, String s) {
                System.out.println("Number: " + num + ", String: " +s);
                }
              }
              public class Main {
                public static void main(String[] args) {
                Display display = new Display();
                display.show("Java", 101); // Output: String: Java, Number: 101
                display.show(202, "00PS"); // Output: Number: 202, String: 00PS
               }
              }
            Run-Time Polymorphism: (Dynamic Polymorphism)
                Run-time polymorphism is achieved through method overriding,
                where a subclass provides a specific implementation of a method already
                defined in its parent class. The method to be called is determined
                at runtime based on the object.
             Runtime Polymorphism:
                class Animal {
                  void sound() {
                    System.out.println("Animal makes a sound");
                  }
                }
                class Dog extends Animal {
                  void sound() {
                    System.out.println("Dog barks");
                   }
                }
                class Cat extends Animal {
                  void sound() {
                    System.out.println("Cat meows");
                  }
                }
                public class Main {
                  public static void main(String[] args) {
                   Animal animal1 = new Dog(); // Upcasting
                   Animal animal2 = new Cat(); // Upcasting
                   animall.sound(); // Calls Dog's overridden method: "Dog barks"
                   animal2.sound(); // Calls Cat's overridden method: "Cat meows"
                  }
                 }

    */

        //
    /*
        Access Modifier Scope within

Access Modifier     Scope within the Class      Scope within the Package    Scope in Subclasses     Scope Everywhere
                                                                            (Different Package)

public                      Yes                         Yes                         Yes                     Yes
protected                   Yes                         Yes                         Yes                      No
default (no keyword)        Yes                         Yes                         No                       No
private                     Yes                          No                         No                       No

        Interface:
            Class --> Blueprint for object
            Interface --> Blueprint for class
        By Interface, we achieve abstraction and multiple inheritance.
        It can have abstract methods, static constants,static methods and default methods.

        Static Methods in Interface:
            Used for utility operations that are RELATED to the interface but don't need
            instance state
            Cannot be overridden by implementing classes
            Called directly on the interface (not through instance)

       interface PaymentValidator {
            boolean validatePayment(Payment payment);
            // Static utility method - helper functions related to validation
            static boolean isValidCreditCard(String cardNumber){
            // Luhn algorithm check
            return cardNumber.length() == 16;
            }
            static boolean isValidAmount(double amount) {
            return amount > 0 && amount < 1000000;
            }
        }

        class PayPalValidator implements PaymentValidator {
            @Override
            public boolean validatePayment(Payment payment){
            // First use static utility method
            if (!PaymentValidator.isValidAmount(payment.getAmount())) {
            return false;
            }
            // Then do PayPal specific validation
            return true;
            }
        }

        Default Methods in Interface

        Provide optional functionality to implementing classes
        Can be overridden if needed
        Can use other interface methods (abstract or
        default)
        Called through instance

        interface PaymentProcessor {
            void processPayment(Payment payment);
            // Default method using abstract method
            default void processPayments(List<Payment> payments) {
                for(Payment payment: payments) {
                processPayment(payment);
                }
            }
            // Default method with common implementation
            default void validateAndProcess(Payment payment) {
                if(payment.getAmount() <= 0) {
                throw new IllegalArgumentException("Invalid
                }
              processPayment(payment);
             }
          }

          class StripeProcessor implements PaymentProcessor {
              @0verride
              public void processPayment(Payment payment) {
              // Stripe specific implementation
              }
              // Can use default processPayments() as is amount");
              // Can override validateAndProcess() if needed
           }

           Interface VS Abstract Class
           Interface:
            achieve multiple inheritance
            we can  not create instance
           Abstract class:
            we can create instance and constructor for the class
            not validate in multiple inheritance

    */

}
