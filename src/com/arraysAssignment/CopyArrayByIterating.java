// Write a Java program to copy an array by iterating the array
package com.arraysAssignment;

import java.util.Arrays;

public class CopyArrayByIterating {
    public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 50};
        // Create a new array to store the copied elements
        int[] copiedArray = new int[originalArray.length];
        // Iterate through the original array and copy each element to the new array
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];  // Copy element at index i
        }
        // Print both arrays
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));
    }
}
