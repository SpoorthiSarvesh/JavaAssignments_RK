//20. Write a Java program to test the equality of two arrays.
package com.arraysAssignment;

import java.util.Arrays;

public class ArrayEqualityTest {
    public static void main(String[] args) {
        // Define two arrays to compare
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4};

        // Test equality using Arrays.equals() method
        if (Arrays.equals(array1, array2)) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }

    }
}
