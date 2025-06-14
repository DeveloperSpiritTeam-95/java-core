package com.springboot.core.basic;

/**
 * @author prabhakar, @Date 15-05-2025
 */

public class Final_Finally_finalize {

    public static void main(String[] args) {

        String final_content = """
                1. final (Keyword)
                The final keyword is used to restrict modifications:
                Final Variable: Cannot be changed once assigned.
                Final Method: Cannot be overridden in subclasses.
                Final Class: Cannot be inherited.
                """;



        String finally_content = """
                finally (Block)
                The finally block always executes, whether an exception is thrown or not.
                It's commonly used to release resources.
                """;

        String finalize_content = """
                finalize() (Method)
                The finalize() method is called by the Garbage Collector
                before an object is destroyed. This helps clean up unnecessary objects.
                """;

        System.out.println("final content: " + final_content);
        System.out.println("finally{} content: " + finally_content);
        System.out.println("finalize() content: " + finalize_content);


    }
}
