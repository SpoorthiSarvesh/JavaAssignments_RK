//Write a Java program to create a new String object with the contents of a character array.
//
//Sample Output:
//
//The book contains 234 pages.

package com.stringsAssignment.Set2;

public class StringFromCharArray {
    public static void main(String[] args) {
        // Create a character array with the contents of the message
        char[] charArray = {'T', 'h', 'e', ' ', 'b', 'o', 'o', 'k', ' ', 'c', 'o', 'n', 't', 'a', 'i', 'n', 's', ' ', '2', '3', '4', ' ', 'p', 'a', 'g', 'e', 's', '.'};

        // Create a new String object from the character array
        String str = new String(charArray);

        // Print the String
        System.out.println(str);
    }
}
