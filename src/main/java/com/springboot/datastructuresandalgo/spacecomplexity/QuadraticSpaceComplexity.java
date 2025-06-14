package com.springboot.datastructuresandalgo.spacecomplexity;

//  O(n^2) - Quadratic Space:
public class QuadraticSpaceComplexity {

    // Explanation:
    //Space Complexity: O(n^2) because we are creating a 2D matrix with a size of n * n.
    //The space usage grows quadratically with n.


    // This example creates a 2D matrix, whose size grows quadratically with the input.

    public static void main(String[] args) {
        int n = 5;

        // Create a 2D matrix of size n x n
        int[][] matrix = createMatrix(n);

        // Print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to create a 2D matrix of size n x n
    public static int[][] createMatrix(int n) {
        int[][] matrix = new int[n][n];  // Quadratic space: O(n^2)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = i * j;  // Fill the matrix
            }
        }
        return matrix;
    }

}
