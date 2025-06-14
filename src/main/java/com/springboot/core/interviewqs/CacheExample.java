package com.springboot.core.interviewqs;

public class CacheExample {

    /*
    Range of values can store:

    Wrapper Class	Primitive Type	Range
    Byte	            byte	    -128 to 127
    Short	            short	    -32,768 to 32,767
    Integer	            int	        -2,147,483,648 to 2,147,483,647
    Long	            long	    -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    Float	            float	    ±3.40282347E+38 (approximately)
    Double	            double	    ±1.79769313486231570E+308 (approximately)
    Character	        char	    0 to 65,535 (Unicode characters)
    Boolean	            boolean	    true or false

    Integer Caching:

    Java has an internal cache for Integer objects within the range of -128 to 127.
    When you create Integer objects within this range, Java reuses existing objects
    from the cache instead of creating new ones.

    The == operator checks for reference equality (whether two variables refer to the
    same object in memory).
    For Integer values within the cached range, == often returns true due to object reuse.
    For values outside the cached range, == generally returns false as new objects are
    created.
    To reliably compare the values of Integer objects, always use the equals() method,
    which checks for value equality.

    */

    public static void main(String[] args) {

        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b); // Output: true (both refer to the same cached object)

        Integer ab = 127;
        Integer ac = 127;
        System.out.println(ab == ac);

        //Both ab and ac are assigned the value 127, which falls within the cached range.
        //Since both variables refer to the same cached object, the == operator returns true.

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y); // Output: false (new objects are created for values outside the cached range)
        System.out.println(x.equals(y)); // Output: true

        //Both x and y are assigned the value 128, which is outside the default cached range.
        //Java creates two separate Integer objects for x and y.
        //As x and y refer to different objects in memory, the == operator returns false.

        Integer z = 200;
        Integer w = 200;
        System.out.println(z == w);
        System.out.println(z.equals(w)); // Output: true
    }
}
