package com.springboot.seniordev.JavaConcurrency;

import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;
import java.util.List;
import java.util.ArrayList;
/**
 * @author prabhakar, @Date 27-03-2025
 */
// RecursiveTask to calculate the sum of a list of numbers
class SumCalculator extends RecursiveTask<Integer> {
    private static final int THRESHOLD = 10; // Threshold for splitting tasks
    private final List<Integer> numbers;

    public SumCalculator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    protected Integer compute() {
        int size = numbers.size();
        if (size <= THRESHOLD) {
            // Base case: Calculate the sum directly
            int sum = 0;
            for (Integer number : numbers) {
                sum += number;
            }
            return sum;
        } else {
            // Recursive case: Split the list and fork subtasks
            int middle = size / 2;
            List<Integer> leftList = numbers.subList(0, middle);
            List<Integer> rightList = numbers.subList(middle, size);

            SumCalculator leftTask = new SumCalculator(leftList);
            SumCalculator rightTask = new SumCalculator(rightList);

            leftTask.fork(); // Asynchronously execute the left task
            int rightSum = rightTask.compute(); // Execute the right task in the current thread
            int leftSum = leftTask.join();    // Wait for the left task to complete and get the result

            return leftSum + rightSum;
        }
    }
}

public class ForkJoinPoolExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        ForkJoinPool pool = ForkJoinPool.commonPool(); // Use the common pool
        SumCalculator calculator = new SumCalculator(numbers);
        Integer sum = pool.invoke(calculator); // Start the computation

        System.out.println("Sum: " + sum);
    }
}
