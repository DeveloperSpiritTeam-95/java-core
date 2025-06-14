package com.springboot.context;

/**
 * @author prabhakar, @Date 28-02-2025
 */

public class Operators {


    public static void main(String[] args) {

        // Arithmetic Operators +, -, *, /, %

        int a = 5 + 3;
        int b = 5 - 3;
        int c = 5 * 3;
        int d = 5 / 3;
        int e = 5 % 3;

        System.out.println("Addition: " + a);
        System.out.println("Subtraction: " + b);
        System.out.println("Multiplication: " + c);
        System.out.println("Division: " + d);
        System.out.println("Modulus: " + e);

        // += is a compound assignment operator.

        a += 10;    // Equivalent to a = a + 10;
        System.out.println("Addition: " + a);
        a -= 10;    // Equivalent to a = a - 10;
        System.out.println("Subtraction: " + a);
        a *= 10;    // Equivalent to a = a * 10;
        System.out.println("Multiplication: " + a);
        a /= 10;    // Equivalent to a = a / 10;
        System.out.println("Division: " + a);
        a %= 10;    // Equivalent to a = a % 10;
        System.out.println("Modulus: " + a);

        // increments
        ++a;    // Equivalent to a = a + 1; // pre increment
        System.out.println("After pre increment: " + a);

        a++;    // Equivalent to a = a + 1; // post increment
        System.out.println("After post increment: " + a);

        --a;
        System.out.println("After pre decrement: " + a);

        a--;
        System.out.println("After post decrement: " + a);

        // on task increment
        System.out.println("pre increment: " + ++a);
        System.out.println("After pre increment: " + a);

        System.out.println("post increment: " + a++);
        System.out.println("After post increment: " + a);

        // on task decrement
        System.out.println("pre decrement: " + --a);
        System.out.println("After pre decrement: " + a);

        System.out.println("post decrement: " + a--);
        System.out.println("After post decrement: " + a);


        int value = 1;
        System.out.println(value);
        // System.out.println(value++ +" "+ --value);
        System.out.println(value++ + --value);
        System.out.println(value++ - --value);
//        System.out.println(value);
        System.out.println(value++ + " " + ++value);

        // Bitwise Operator
        int z = 2;
        System.out.println(z);
        System.out.println(Integer.toBinaryString(z));
        System.out.println(Integer.toHexString(z));
        System.out.println(Integer.toOctalString(z));
        System.out.println(Integer.decode("18"));

        // Bitwise AND (&)
        // Performs a bit-by-bit AND operation
        // The result bit is 1 only if both corresponding bits are 1
        int x = 5;  // 0101 in binary
        System.out.println(Integer.toBinaryString(x));
        int y = 3;  // 0011 in binary
        System.out.println(Integer.toBinaryString(y));
        z = x & y; // 0001 (1 in decimal)
        System.out.println(z);

        System.out.println("AND Operator:");
        System.out.println("5 & 3 = "+ (x & y));
        System.out.println("Binary: "+ Integer.toBinaryString(x & y));

        // Bitwise OR (|)
        // Performs a bit-by-bit OR operation.
        // The result bit is 1 if at least one of the corresponding bits is 1.
        z = x | y;  // 0111 (7 in decimal)
        System.out.println(z);
        System.out.println("OR Operator:");
        System.out.println("5 | 3 = "+ (x | y));
        System.out.println("Binary: "+ Integer.toBinaryString(x | y));

        // Bitwise XOR (^)
        // Performs a bit-by-bit exclusive OR (XOR) operation.
        // The result bit is 1 if the corresponding bits are different
        z = x ^ y;  // 0110 (6 in decimal)
        System.out.println(z);
        System.out.println("XOR Operator:");
        System.out.println("5 | 3 = "+ (x | y));
        System.out.println("Binary: "+ Integer.toBinaryString(x | y));

        // Bitwise NOT (~)
        // Performs a bit-by-bit NOT (complement) operation.
        // Inverts all the bits (0 becomes 1, and 1 becomes 0).

        int g = 5;  // 0101 in binary
        int h = ~g; // 11111111111111111111111111111010 (in 32-bit int, -6 in decimal)
        System.out.println(h);
        System.out.println("NOT ~ Operator:");
        System.out.println("~5 "+ (~g));
        System.out.println("Binary: "+ Integer.toBinaryString(~g));

        // Left Shift (<<)
        // Shifts the bits to the left by a specified number of positions.
        // Equivalent to multiplying by 2 raised to the power of the shift amount.
        int val = 5;  // 0101 in binary
        int res = val << 2; // 10100 (20 in decimal)
        System.out.println(res);
        System.out.println("Left Shift Operator:");
        System.out.println("5 << 1 = "+ (val << 2));
        System.out.println("Binary: "+ Integer.toBinaryString(val << 2));

        // Right Shift (>>)
        // Shifts the bits to the right by a specified number of positions.
        // If the number is positive, fills the leftmost bits with 0s (arithmetic right shift).
        // If the number is negative, fills the leftmost bits with 1s (sign extension).
        // Equivalent to dividing by 2 raised to the power of the shift amount.

        val = 20; // 10100 in binary
        res = val >> 2; // 00101 (5 in decimal)
        System.out.println(res);

        val = -20; // 111...10100 in binary
        res = val >> 2; // 111...11101 ( -5 in decimal)
        System.out.println(res);

        System.out.println("Right Shift Operator:");
        System.out.println("20 >> 2 = "+ (val >> 2));
        System.out.println("Binary: "+ Integer.toBinaryString(val >> 2));

        // Unsigned Right Shift (>>>)
        // Shifts the bits to the right by a specified number of positions.
        // Always fills the leftmost bits with 0s, regardless of the sign.

        val = -20; // 111...10100 in binary
        res = val >>> 2; // 001...11101 (a very large positive number)

        System.out.println(res);
        System.out.println("Unsigned Right Shift Operator:");
        System.out.println("-20 >>> 2 = "+ (val >>> 2));
        System.out.println("Binary: "+ Integer.toBinaryString(val >>> 2));

        /*
        Use Cases:

        Low-Level Programming: Working with hardware or embedded systems.
        Bit Manipulation: Setting, clearing, or toggling specific bits.
        Flags and Masks: Representing multiple boolean values using individual bits.
        Cryptography: Implementing encryption and decryption algorithms.
        Performance Optimization: Performing certain calculations more efficiently.
        Working with Color Values: Manipulating individual color components (red, green, blue).

        */

    }

}
