//Write a Java program to find the common elements between two arrays (string values).
package com.arraysAssignment;

public class CommonElementsInTwoStringArrays {
    public static void main(String[] args) {
        String[] array1 = {"apple", "banana", "cherry", "date"};
        String[] array2 = {"date", "cherry", "fig", "grape"};
        // Print the common elements
        System.out.println("Common elements between the two arrays:");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                // Check if the current element in array1 matches an element in array2
                if (array1[i].equals(array2[j])) {
                    System.out.println(array1[i]);  // Print the common element
                    break;  // No need to check further for this element
                }
            }
        }
    }
}
