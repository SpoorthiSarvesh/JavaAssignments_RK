//Write a Java program to find the duplicate values of an array of string values.
package com.arraysAssignment;

public class DuplicateValuesOfStringValues {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "apple", "date", "banana", "fig"};
        // Find and print duplicates
        System.out.println("Duplicate string values:");
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    System.out.println(words[i]);
                    break;  // No need to check further for this duplicate
                }
            }
        }
    }
}
