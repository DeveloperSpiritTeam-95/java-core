package com.springboot.context;

import java.util.stream.IntStream;

/**
 * @author prabhakar, @Date 06-03-2025
 */

public class ConditionalStatements {

    // Conditional Statements
    // Relational Operators     <,   >,  <=, >=, ==, !=
    // Logical Operators        &&-->(AND),  ||-->(OR),    !-->(NOT)
    // They return a boolean result     true / false

        /*
            Operand 1       Operand 2     Operand1 && Operand2
              true            true              true
              true            false             false
              false           true              false
              false           false             false

            Operand 1       Operand 2     Operand1 || Operand2
              true            true              true
              true            false             true
              false           true              true
              false           false             false

        */

    public static void main(String[] args) {

        int value = 5;
        int value2 = 10;
        int value3 = 5;

        // Relational Operators     <,   >,  <=, >=, ==, !=

        System.out.println(value);
        System.out.println(value2);
        System.out.println(value3);

        // Operator > (greater than)
        System.out.println(value > value2);     // 5 > 10   false
        System.out.println(value > value3);     // 5 > 5    false

        // Operator < (less than)
        System.out.println(value < value2);     // 5 < 10   true
        System.out.println(value < value3);     // 5 < 5    false

        System.out.println(value2 > value3);    // 10 > 5   true
        System.out.println(value3 > value2);    // 5 > 5    false

        // Operator >= (greater than equals to)
        System.out.println(value >= value2);    // 5 >= 10  false
        System.out.println(value2 >= value3);   // 10 >= 5  true

        // Operator <= (less than equals to)
        System.out.println(value <= value2);    // 5 <= 10  true
        System.out.println(value <= value3);    // 5 <= 5   true
        System.out.println(value2 <= value3);   // 10 <= 5  false

        // Operator == (double equals to)
        System.out.println(value == value2);    // 5 == 10  false
        System.out.println(value == value3);    // 5 == 5   true
        System.out.println(value2 == value3);   // 10 == 5  false

        // Operator != (not equals to)
        System.out.println(value != value2);    // 5 != 10  true
        System.out.println(value != value3);    // 5 != 5   false
        System.out.println(value2 != value3);   // 10 != 5  true


        // Logical Operators        &&-->(AND),  ||-->(OR),    !-->(NOT)
        // we are combines the conditions on Logical operators

        // Operator &&-->(AND)
        System.out.println(value != value2 && value != value3); // 5 != 10  true && 5 != 5   false --> false

        // Operator ||-->(OR)
        System.out.println(value != value2 || value != value3); // 5 != 10  true || 5 != 5   false --> true

        // !-->(NOT)
        System.out.println(value != value2 && !(value != value3));// 5 != 10  true && !(5 != 5)  not false --> true

        System.out.println(5 == 5 && 10 == 5 && true || true);      // true
        System.out.println(5 == 5 && 10 == 5 && false || true);     // true
        System.out.println((5 == 5 && 10 == 5 ) && (true || true)); // false
        System.out.println((5 == 5 && 10 == 5 ) && (false || true));// false


        // play with boolean values
        boolean isSunny = true;
        boolean isWarm = false;
        System.out.println(isSunny && isWarm);      // false

        System.out.println((isSunny && isWarm) || (isSunny || isWarm));     //true
        System.out.println((isSunny && !isWarm) || (!isSunny || isWarm));   //true


        // Conditional StatementsConditional statements in Java allow the program to make
        //decisions based on conditions and execute specific blocks of code depending on the outcome.

        //1. if Statement
        //2. if-else Statement
        //3. if-else if Ladder
        //4. switch Statement (works with int, char, String, and enum types)
        //5. Ternary Operator (variable = (condition) ? value_if_true: value_if_false;)

        // if
        if (isSunny && isWarm) {
            System.out.println("Sunny");
        }

        // if-else
        if (isSunny || isWarm) {
            System.out.println("Sunny");
        }else {
            System.out.println("Warm");
        }

        // if-else-if
        if (isSunny  && !isWarm) {
            System.out.println("Sunny");
        }else if (isSunny || isWarm) {
            System.out.println("Warm");
        }else {
            System.out.println("Not Sunny");
        }

        // Switch
        String day = "MONDAY";
        switch (day){
            case "MONDAY":
                System.out.println("MONDAY");
                break;
                case "TUESDAY":
                    System.out.println("TUESDAY");
                    break;
                    case "WEDNESDAY":
                        System.out.println("WEDNESDAY");
                        break;
                        case "THURSDAY":
                            System.out.println("THURSDAY");
                            break;
                            case "FRIDAY":
                                System.out.println("FRIDAY");
                                break;
                                case "SATURDAY":
                                    System.out.println("SATURDAY");
                                    break;
                                    case "SUNDAY":
                                        System.out.println("SUNDAY");
                                        break;
                                        default:
                                            System.out.println("Invalid Input");
                                            break;
        }

        // Ternary
        String variable = (isSunny && isWarm) ? "Sunny" : "Warm";

        System.out.println(isSunny || isWarm ? "Sunny" : "Warm");

        System.out.println(variable);

        /*
            Statement                     Use Case
                if               When a single condition needs to be evaluated.
              if-else            When there are two conditions: one for true and one for false.
              if-else if         When there are multiple conditions to evaluate in sequence.
               switch            When you have multiple discrete values for a single variable to compare.
              Ternary            When you need a compact way to represent simple if-else logic.

        */

        // Loops
        // 1. for Loop
        // 2. Enhanced for Loop (for-each Loop)
        // 3. while Loop
        // 4. do-while Loop

        System.out.println("For loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("While loop:");
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("Do while:");
        i = 1;
        do {
            System.out.println(i);
            i++;
        }while (i <= 10);

        System.out.println("For Each loop: ");

        int[] arr = {1,2,3,4,5};
        for (int val : arr) {
            System.out.println(val);
        }

        System.out.println("InStream Range loop: ");
        IntStream.range(1, 11).forEach(System.out::println);
    }
}
