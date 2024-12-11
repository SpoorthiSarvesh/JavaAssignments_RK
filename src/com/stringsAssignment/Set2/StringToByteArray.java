//16. Write a Java program to get the contents of a given string as a byte array.
//
//Sample Output:
//
//The new String equals This is a sample String.
package com.stringsAssignment.Set2;

public class StringToByteArray {
    public static void main(String[] args) {
        // Given string
        String str = "This is a sample String.";

        // Convert the string to a byte array
        byte[] byteArray = str.getBytes();

        // Convert the byte array back to a string
        String newString = new String(byteArray);

        // Print the result
        System.out.println("The new String equals " + newString);
    }
}
