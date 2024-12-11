//
//40. Write a Java program to divide a string in n equal parts.
//
//Sample Output:
//
//The given string is: abcdefghijklmnopqrstuvwxy
//The string divided into 5 parts and they are:
//
//abcde
//        fghij
//klmno
//        pqrst
//uvwxy
package com.stringsAssignment.Set4;

public class DivideString {

    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxy";
        int n = 5;

        System.out.println("The given string is: " + str);
        System.out.println("The string divided into " + n + " parts and they are:\n");

        divideStringIntoParts(str, n);
    }

    // Method to divide the string into n equal parts
    public static void divideStringIntoParts(String str, int n) {
        // Calculate the length of each part
        int len = str.length();
        int partLength = len / n;
        int remainder = len % n;

        int start = 0;

        // Loop through and divide the string into equal parts
        for (int i = 0; i < n; i++) {
            // If there's a remainder, add one character to the current part
            int currentPartLength = partLength + (i < remainder ? 1 : 0);

            // Extract and print the substring for the current part
            System.out.println(str.substring(start, start + currentPartLength));

            // Update the start index for the next part
            start += currentPartLength;
        }
    }
}

