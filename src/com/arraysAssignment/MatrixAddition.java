//19. Write a Java program to add two matrices of the same size.
package com.arraysAssignment;

public class MatrixAddition {
    public static void main(String[] args) {
        // Define two matrices of the same size
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        // Get the number of rows and columns from the matrices (assuming both matrices are the same size)
        int rows =3; //matrix1.length;
        int cols =3; //matrix1[0].length;

        // Result matrix to store the sum
        int[][] result = new int[rows][cols];

        // Loop through each element of the matrices and add corresponding elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Print the resulting matrix
        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
