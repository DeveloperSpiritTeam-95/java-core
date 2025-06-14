package com.springboot.context;

/**
 * @author prabhakar, @Date 28-02-2025
 */

public class JavaIntro {

    // What is JAVA

    /*
        Java ia an Object-Oriented programming Language.

        Java is known for its "Write Once, Run Anywhere" capability,
        meaning Java code can run on any platform that has a Java Virtual Machine (JVM)
        installed.
        This platform independence is one of Java's biggest strengths.

     Install Java:
        Install Java = Install JDK
        When you install JDK,
        you are also installing JVM &JRE

        JDK big box contains JRE  ==> contains JVM
     JDK:
        The Java Development Kit is a comprehensive software development environment
        used for developing Java applications.
        It includes everything you need to develop Java programs, including:

        1. The Java compiler (javac) to convert your Java source code
           (.java files) into bytecode (.class files)
        2. Development tools like debugger, documentation generator (javadoc)
        3. Source files for Java core classes
        4. The JRE (which includes the JVM)

     JRE:
        The Java Runtime Environment is what's needed to run Java
        applications on a computer. It consists of:

        1. The Java Virtual Machine (JVM)
        2. Compiled Core classes (like String, Integer, ArrayList, etc.) and
           supporting files (Configuration files that tell Java how to run)
        3. No development tools (unlike JDK) - it's meant for end users who
           just want to run Java applications
        4. JRE (Java Runtime Environment) can be installed without JDK (JavaDevelopment Kit)
           since JRE is only needed to run Java applications,while JDK is needed to develop
           them.
     JVM:
        JVM is the actual engine that runs the Java bytecode on any platform.

     JDK
      |---Development Tools (javac, etc.)
      |---Source Code
      |---JRE
           |---JVM
           |---Core Classes (compiled)
           |---Supporting Files

     To summarize their relationship:
        --> JDK contains JRE, which contains JVM
        --> Developers need JDK to create Java applications
        --> End users only need JRE to run Java applications
        --> JVM is the actual engine that runs the Java bytecode on any platform

      A Java program runs through a clear pipeline:

        1. Source Code is written in .java files.

        2. Compilation transforms it into platform-independent bytecode (.class).

        3. Execution is handled by the JVM, which interprets or compiles
           the bytecode into native code for the specific operating system
           and hardware, allowing the program to run seamlessly across
           different environments.

                --compilation-->           --Interpretation-->
                                 --javac-->                   --JVM-->
         Test.java              byte code                   machine code(binary) 0s 1s
                           (platform independent)           (platform dependent)

    */

    public static void main(String[] args) {

        System.out.println("Hello World");
        //System.err.println("Hello World");

        /*
        This is the main method.
            In java, the main method is the entry point of a program.
            It has a specific signature:
        public:
            Access modifier indicating that the method can be accessed from outside the class.
        static:
            Indicates that the method belongs to the class rather than an instance of the class.
        void:
            specifies that the method does not return any value.
        main:
            The name of the method.
        String[] args:
            The method accepts an array of strings as parameters.
            This is where command-line arguments can be passed to your program.

        This line prints the string "Hello World" to the console. Breakdown:

        System:
            A class in the java.lang package that provides access to the system,
            including the console.
        out:
            An instance of PrintStream class within the System class, representing the console.
        println:
            A method used to print a line of text to the console.
        "Hello World":
            The string to be printed.

        The semicolon in java is a crucial element to indicate the end of a statement.
        It helps the compiler understand the structure of yours code by making the boundaries
        between different statements.

        */
    }
}
