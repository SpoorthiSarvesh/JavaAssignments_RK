
//18. Write a Java program to create a unique identifier of a given string.
//
//Sample Output:
//
//The hash for Python Exercises. is 863132599
package com.stringsAssignment.Set2;

public class UniqueIdentifier {
    public static void main(String[] args) {
        // Given string
        String str = "Python Exercises.";

        // Get the hash code of the string
        int hashValue = str.hashCode();

        // Print the hash code as a unique identifier
        System.out.println("The hash for " + str + " is " + hashValue);
    }
}
