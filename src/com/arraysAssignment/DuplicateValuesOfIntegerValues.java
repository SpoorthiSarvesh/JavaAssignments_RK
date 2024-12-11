//Write a Java program to find the duplicate values of an array of integer values.

package com.arraysAssignment;

public class DuplicateValuesOfIntegerValues {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 10, 40, 50, 20};
        // Find and print duplicates
        System.out.println("Duplicate values:");
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    System.out.println(num[i]);
                    break;  // No need to check further for this duplicate
                }
            }
        }
    }
}
