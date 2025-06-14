package com.springboot.sysdesign;

/**
 * @author prabhakar, @Date 24-02-2025
 */

public class FeaturesInJava {

    // the key features introduced in Java 8, 11, and 17.

    /*
      Java 8 (March 2014) - A Major Shift
        Java 8 brought a paradigm shift with features that significantly
        changed how Java code is written.
      Lambda Expressions:
        Enabled functional programming by allowing you to treat functions as
        first-class citizens. This made code more concise and expressive,
        especially for working with collections.
      Streams API:
        Provided a powerful way to process collections of data in a declarative style,
        enabling parallel operations and improved performance.
      Functional Interfaces:
        Interfaces with a single abstract method. Used extensively with Lambda expressions.
      Method References:
        A shorthand for lambda expressions when you're calling an existing method.
      Default Methods in Interfaces:
        Allowed adding new methods to interfaces without breaking existing implementations.
        This was crucial for evolving APIs.
      Date and Time API (java.time):
        A completely rewritten and much improved date and time API, addressing the
        shortcomings of the old java.util.Date and Calendar classes.
      Optional:
        A container object that may or may not contain a non-null value.
        Helps avoid NullPointerExceptions.
      Nashorn JavaScript Engine:
        Allowed running JavaScript code on the JVM. (Less emphasized in later versions).

    */

    /*
      Java 11 (September 2018) -Focus on Performance and Developer Productivity
        Java 11, while not as revolutionary as Java 8, focused on refinements and improvements.
      HTTP Client API:
        A standardized and modern HTTP client API, replacing the older HttpURLConnection.
        Supports HTTP/2.
      Local-Variable Type Inference (var):
        Allows the compiler to infer the type of  local variable, making code more concise.
        For example: var message = "Hello";
      String Methods:
        Added new methods to the String class,
        such as isBlank(), strip(), lines(), and repeat().
      Garbage Collection Improvements:
        Enhancements to garbage collectors for better performance.
      Flight Recorder:
        A low-overhead profiling tool for diagnosing performance problems in production.

    */

    /*
      Java 17 (September 2021) -Further Enhancements and Long-Term Support
        Java 17 is the current LTS version and builds upon the previous releases.
      Sealed Classes:
        Restrict which classes can inherit from a particular class or interface.
        Improves security and maintainability.
      Text Blocks (Triple-quoted strings):
        Makes it easier to work with multi-line strings, especially useful
        for embedding HTML, JSON, or SQL queries in your code.
      Pattern Matching for instanceof:
        Simplifies the common pattern of checking the type of object and then casting it.
      Records:
        A concise way to create immutable data classes. Automatically generates equals(),
        hashCode(), and toString() methods.
      Switch Expressions:
        Allows using lambda expressions and other features within switch statements,
        making them more powerful.
      Hidden Classes:
        Classes that are generated at runtime and not directly referenced by
        the application code. Used by frameworks and other tools.

    */

    /*
        Feature	                    Java 8	    Java 11	    Java 17
        Lambda Expressions	            ✅	        ✅	        ✅
        Streams API	                    ✅	        ✅	        ✅
        Local-Variable Type Inference	            ✅	        ✅
        HTTP Client API		                        ✅	        ✅
        Sealed Classes			                                ✅
        Text Blocks			                                    ✅
        Records			                                        ✅

        It's important to be familiar with these features, especially those from
        the LTS releases (8, 11, and 17), as they are widely used in modern Java development.
        Each version brings improvements in performance, developer productivity, and security.
    */
}
