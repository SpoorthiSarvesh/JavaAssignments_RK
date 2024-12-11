//38. Write a Java program to print after removing duplicates from a given string.
//
//Sample Output:
//
//The given string is:  ramaresource.com
//After removing duplicates characters the new string is:
        package com.stringsAssignment.Set4;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

        public static void main(String[] args) {
                String input = "ramaresource.com";

                System.out.println("The given string is: " + input);

                // Call the method to remove duplicates
                String result = removeDuplicates(input);

                System.out.println("The string after removing duplicates: " + result);
        }

        // Method to remove duplicate characters from a string
        public static String removeDuplicates(String str) {
                // Use LinkedHashSet to maintain the insertion order
                LinkedHashSet<Character> set = new LinkedHashSet<>();

                // Add each character to the set
                for (char c : str.toCharArray()) {
                        set.add(c);
                }

                // Build the result string from the set
                StringBuilder result = new StringBuilder();
                for (char c : set) {
                        result.append(c);
                }

                return result.toString();
        }
}

