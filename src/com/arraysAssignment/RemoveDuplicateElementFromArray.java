//16. Write a Java program to remove duplicate elements from an array
package com.arraysAssignment;

public class RemoveDuplicateElementFromArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 30, 40, 50, 50, 60};
        // New array to store unique elements
        int[] tempArray = new int[array.length];
        int uniqueCount = 0;

        // Loop through the original array
        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;

            // Check if the current element is already in tempArray
            for (int j = 0; j < uniqueCount; j++) {
                if (array[i] == tempArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, add it to tempArray
            if (!isDuplicate) {
                tempArray[uniqueCount] = array[i];
                uniqueCount++;
            }
        }

        // Print the unique elements
        System.out.println("Array without duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(tempArray[i] + " ");
        }
    }
}
