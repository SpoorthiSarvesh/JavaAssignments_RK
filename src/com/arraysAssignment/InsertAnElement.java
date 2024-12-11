
//9. Write a Java program to insert an element (specific position) into an array.
        package com.arraysAssignment;

import java.util.Arrays;

public class InsertAnElement {
    public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 50};
        int elementToInsert = 25;
        int position = 2;  // Insert at index 2 (3rd position)
        // Create a new array with one extra space
        int[] newArray = new int[originalArray.length + 1];
        // Copy elements before the insertion position
        for (int i = 0; i < position; i++) {
            newArray[i] = originalArray[i];
        }
        // Insert the new element at the desired position
        newArray[position] = elementToInsert;
        // Copy the remaining elements after the insertion position
        for (int i = position + 1; i < newArray.length; i++) {
            newArray[i] = originalArray[i - 1];
        }
        // Print the original and the modified array
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Array after insertion: " + Arrays.toString(newArray));
    }
}
