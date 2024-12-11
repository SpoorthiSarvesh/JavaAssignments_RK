//17. Write a Java program to get the contents of a given string as a character array.
//
//Sample Output:
//
//The char array equals "[C@2a139a55"
package com.stringsAssignment.Set2;

public class StringToCharArray {
//    public static void main(String[] args) {
//        // Given string
//        String str = "This is a sample String.";
//
//        // Convert the string to a character array
//        char[] charArray = str.toCharArray();
//
//        // Print the character array using the default toString representation
//        System.out.println("The char array equals " + charArray);
//    }
//}

    public static void main(String[] args) {
        // Given string
        String str = "This is a sample String.";

        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Print the contents of the character array
        System.out.println("Character array contents:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}
