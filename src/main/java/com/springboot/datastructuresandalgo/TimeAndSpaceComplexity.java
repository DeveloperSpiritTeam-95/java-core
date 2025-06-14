package com.springboot.datastructuresandalgo;

public class TimeAndSpaceComplexity {

    // Time And Space Complexity On DSA or Program or Function or Process

    /*
        Time Complexity:
            It Measures the amount of time an algorithm taken to run the process or functionality.
            A measure of how efficient an algorithm is in terms of time.

        Space Complexity:
            Measures the amount of memory an algorithms takes to run on process or data or function.
            A measure s of how efficient an algorithm is in terms of memory usage.

        Representing Time and Space Complexity:
            Time and Space Complexities are represented using asymptotic notations like Big O,
            Theta and Omega.

        When analyzing the time and space complexity of a program or algorithm,
        it's important to understand how the program's behavior grows in relation
        to the size of the input. The two main complexities we typically look at are
        Time Complexity and Space Complexity.

        Time complexity refers to how the running time of an algorithm increases as
        the input size increases. It is generally expressed in terms of Big O notation
        (like O(n), O(log n), O(n2), etc.)
        which helps us understand the worst-case scenario of the algorithm's performance.

        Steps to Identify Time Complexity:

        1. Count the Basic Operations:
            Determine how many basic operations (such as comparisons, assignments, additions)
            the algorithm performs based on the input size.
        2. Look at the Loops:
            If the algorithm contains loops, examine how many times each loop runs.
            Constant-time loops: O(1) (doesn’t depend on input size)
            Linear-time loops: O(n) (depends on the size of the input).
            Nested loops: The complexity of nested loops is the product of the loops’ complexities.
            For example, a nested loop with two loops each running n times results in O(n2).
        3. Analyze Recursive Functions:
            For recursive algorithms, use the recurrence relation to calculate time complexity.
            A recurrence relation expresses the total time for an algorithm based on the time
            for smaller sub problems.

            Example: A simple divide-and-conquer algorithm (like Binary Search) can be represented as:
            T(n)=T(n/2)+O(1)
            Solving this recurrence results in O(log n).

        4. Consider Function Calls and Other Operations:
            The number of function calls and other operations like sorting
            (which has its own time complexity) can impact the total complexity.

Common Time Complexities:
    O(1): Constant time — The algorithm takes the same amount of time regardless of input size.

    O(n): Linear time — The algorithm's time grows linearly with the input size.

    O(log n): Logarithmic time — The algorithm reduces the problem size in each step (like binary search).

    O(n log n): Log-linear time — Common for divide-and-conquer algorithms (like Merge Sort).

    O(n2): Quadratic time — Common in algorithms with nested loops (like Bubble Sort).

    O(2n): Exponential time — Algorithm's time doubles with each additional input element
           (like in brute-force solutions to the Traveling Salesman Problem).

    O(n!): Factorial time — This complexity arises in some algorithms for combinatorial
           problems (like brute-force solutions to the N-Queens problem).

    Time Complexity:
        In each iteration of the loop, the size of the search space is halved.
        The number of times the loop runs is proportional to log n, where n is the size of the array.
        Therefore, the time complexity of binary search is 𝑂(log 𝑛).

    */


    public int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }



    /*
        Space Complexity:
            Space complexity refers to how the amount of memory used by an algorithm
            increases as the input size increases.

        Steps to Identify Space Complexity:
            1. Count the Memory Usage:
                Determine how much extra memory (besides the input) the algorithm uses.
                This includes:
                    Variables
                    Data structures (arrays, lists, stacks, etc.)
                    Recursive calls (each recursive call typically adds a new frame to
                    the stack).
            2. Analyze the Data Structures:
                If the algorithm uses extra data structures, the space complexity will depend on the size of those structures.
                For example, using an array of size n will contribute O(n) space complexity.

            3. Consider Recursive Algorithms:
                Recursive algorithms use additional memory for each function call.
                The depth of recursion often determines the space complexity.

                Example: A recursive binary search would have O(log n) space complexity
                because of the maximum recursion depth (not counting the input array itself).

            4. Consider In-place Algorithms:
                An algorithm that uses only a small amount of extra memory is called in-place.
                These algorithms have O(1) space complexity.

Common Space Complexities:
        O(1): Constant space — The algorithm uses a fixed amount of space regardless
              of the input size.
        O(n): Linear space — The algorithm uses space proportional to the input size.
        O(log n): Logarithmic space — Common in recursive algorithms with a depth of log n.

        Space Complexity:
            We are using a fixed amount of memory (just a few integer variables:
            left, right, mid).
            There is no extra memory allocated that grows with the input size,
            so the space complexity is O(1).

How to Identify Time and Space Complexity in Code:
     1. Identify the loops and recursion:
            Single loops typically contribute O(n) nested loops O(n2), ect.
            Recursion typically adds a factor of O(log n) depending on the recursion depth.
     2. Account for extra space usage:
            Extra arrays or lists use O(n) space.
            Recursive calls add to the call stack, contributing to O(log n) or O(n) space.
     3. Combine the results:
            If there are multiple components in the algorithm (like nested loops), combine
            their complexities. Use the worst-case complexity when determining the overall complexity.


    */
}
