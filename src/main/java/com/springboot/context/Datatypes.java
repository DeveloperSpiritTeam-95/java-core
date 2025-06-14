package com.springboot.context;

/**
 * @author prabhakar, @Date 28-02-2025
 */

public class Datatypes {

    // Data types & Variables

    /*

    Data Types:

        Integral Numbers:
            byte    (1byte = 2 bit)
            short   (2 bytes)
            int     (4 bytes)
            long    (8 bytes)

        Decimal Numbers:
            float   (4bytes)
            double  (8 bytes)
        True/False
            boolean (1 bit)
        Character
            char    (1 bit)

    Variables:
        below the all type of variables and declaration, initialization, assignment
        String message = "Hello";
        System.out.println(message);
    */

    public static void main(String[] args) {

        System.out.println("Byte Range:");
        System.out.println("-----------");
        byte a = 127;
        System.out.println("Example byte value: " + a);
        System.out.println("Minimum byte value: " + Byte.MIN_VALUE);    // -128 (8 bits)
        System.out.println("Maximum byte value: " + Byte.MAX_VALUE);    //  127


        System.out.println("Short Range:");
        System.out.println("-----------");

        short b = 32;
        System.out.println("Example short value: " + b);
        System.out.println("Minimum short value: " + Short.MIN_VALUE);
        System.out.println("Maximum short value: " + Short.MAX_VALUE);

        System.out.println("Integer Range:");
        System.out.println("-----------");
        int i = 127456789;
        System.out.println("Example int value: " + i);
        System.out.println("Minimum int value: " + Integer.MIN_VALUE);
        System.out.println("Maximum int value: " + Integer.MAX_VALUE);

        System.out.println("Long Range:");
        System.out.println("-----------");
        long l = 9223372036854775807L;
        System.out.println("Example long value: " + l);
        System.out.println("Minimum long value: " + Long.MIN_VALUE);
        System.out.println("Maximum long value: " + Long.MAX_VALUE);

        System.out.println("Float Range:");
        System.out.println("-----------");
        float f = 123.456f;
        System.out.println("Example float value: " + f);
        System.out.println("Minimum float value: " + Float.MIN_VALUE);
        System.out.println("Maximum float value: " + Float.MAX_VALUE);

        System.out.println("Double Range:");
        System.out.println("-----------");
        double d = 123.456d;
        System.out.println("Example double value: " + d);
        System.out.println("Minimum double value: " + Double.MIN_VALUE);
        System.out.println("Maximum double value: " + Double.MAX_VALUE);

        System.out.println("Character Range:");
        System.out.println("-----------");
        char c = 'A';
        System.out.println("Example char value: " + c);
        System.out.println("Minimum char value: " + (int)Character.MIN_VALUE);
        System.out.println("Maximum char value: " + (int)Character.MAX_VALUE);

        System.out.println("Boolean Range:");
        System.out.println("-----------");
        boolean bool = true;
        System.out.println("Example boolean value: " + bool);
        System.out.println("Maximum boolean value: " + Boolean.TRUE);   // 1
        System.out.println("Minimum boolean value: " + Boolean.FALSE);  // 0

        System.out.println("-------------");
        System.out.println("Narrowing Conversion from large type to short type:");
        byte byteValue = 12;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;
        char charValue = 'A';
        System.out.println("byte value: " + byteValue);
        System.out.println("short value: " + shortValue);
        System.out.println("integer value: " + intValue);
        System.out.println("long value: " + longValue);
        System.out.println("float value: " + floatValue);
        System.out.println("double value: " + doubleValue);
        System.out.println("Character value: " + charValue);

        // compilation error capacity problem must cast
//        floatValue = doubleValue;
//        intValue = longValue;
//        shortValue = intValue;
//        byteValue = shortValue;
//        charValue = byteValue;

       floatValue = (float) doubleValue;
       intValue = (int) longValue;
       shortValue = (short) intValue;
       byteValue = (byte) shortValue;
       charValue = (char) byteValue;
       doubleValue = longValue;

        System.out.println("Byte value: " + byteValue);
        System.out.println("Short value: " + shortValue);
        System.out.println("Integer value: " + intValue);
        System.out.println("Long value: " + longValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);
        System.out.println("Character value: " + charValue);

        longValue = (long) doubleValue;
        intValue = (int) doubleValue;
        shortValue = (short) floatValue;
        System.out.println("Long value: " + longValue);
        System.out.println("Integer value: " + intValue);
        System.out.println("Short value: " + shortValue);


        String message = "Hello";   // String literal
        System.out.println(message);

        char[] data = {'a', 'b', 'c'};

        // jvm  --> heap memory because new keyword
        String str = new String(data);  // String object Using Constructor
        System.out.println(str);

        System.out. println("abc");
        String cde = "cde";
        System.out. println("abc" + cde);
        String val1 = "abc".substring(2, 3);
        String val2 = cde.substring(1, 2);
        System.out.println(val1);
        System.out.println(val2);

        //message = null;
        //System.out.println(message.length());     // NullPointerException

        int value = 2;  // stores in stack memory because of number values

        // String pool Vs heap
        String string1 = "Hello";
        String string2 = "Hello";
        String string3 = new String("Hello");
        System.out.println(string1 == string2);         // true (same reference in pool)
        System.out.println(string1 == string3);         // false (different objects)
        System.out.println(string1.equals(string2));    // true (same content)
        System.out.println(string1.equals(string3));    // true (same content)

        // sample example

        int stack = 23;     // stores in stack
        String string = "Prabha";   // stores in pool
        String name = "Prabha";     // name referred string address in pool memory area
        String result = new String("Prabha");   // stores in heap memory
        System.out.println(stack);
        System.out.println(string);
        System.out.println(name);
        System.out.println(result);


        System.out.println(stack == stack);     // checking reference and value
        System.out.println(string == string);   // checking reference and value
        System.out.println(string == string3);  // checking reference and value
        System.out.println(string.equals(string2)); // checking the value not reference

        // String Immutability
        System.out.println(name);
        name.toUpperCase();
        // here immutable
        System.out.println(name);   // still prints Prabha

        name = name.toUpperCase();
        System.out.println(name);   // Create new String PRABHA

       // Common String Operations
        String text = "Hello World";

        // Length
        System.out.println(text.length()); // 11

        // Accessing characters
        System.out.println(text.charAt(0)); // 'H'

        // Substring
        System.out.println(text.substring(0,5)); // "Hello"

        // Contains, startsWith, endsWith
        System.out.println(text.contains("World")); // true
        System.out.println(text.startsWith("Hello"));
        System.out.println(text.endsWith("World"));

        // Replace
        String newText = text.replace("World", "Java");

        System.out.println(newText);
    }

}
