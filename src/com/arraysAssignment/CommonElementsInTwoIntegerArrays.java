// Write a Java program to find the common elements between two arrays of integers
package com.arraysAssignment;

public class CommonElementsInTwoIntegerArrays {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {30, 40, 60, 70};
        // Print the common elements
        System.out.println("Common elements between the two arrays:");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                // Check if the current element in array1 matches an element in array2
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);  // Print the common element
                    break;  // No need to check further for this element
                }
            }
        }
    }
}
