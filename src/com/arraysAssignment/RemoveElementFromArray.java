//7. Write a Java program to remove a specific element from an array.
        package com.arraysAssignment;

import java.util.Arrays;

public class RemoveElementFromArray {
    public static void main(String[] args) {

        int[] num = {10, 20, 30, 40, 50};
        int target = 30;
        // Find the index of the target element and create a new array
        int[] newArray = new int[num.length - 1];  // New array with one less element
        int j = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != target) {
                newArray[j++] = num[i];  // Copy the element to the new array
            }
        }
        // Print the new array
        System.out.println(Arrays.toString(newArray));
    }
}
