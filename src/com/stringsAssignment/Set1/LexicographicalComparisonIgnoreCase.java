//Write a Java program to compare two strings lexicographically, ignoring case differences.
//
//Sample Output:
//
//String 1: This is exercise 1
//String 2: This is Exercise 1
//        "This is exercise 1" is equal to "This is Exercise 1"
package com.stringsAssignment;

public class LexicographicalComparisonIgnoreCase {
    public static void main(String[] args) {

        String string1 = "This is exercise 1";
        String string2 = "This is Exercise 1";

        // Print the strings
        System.out.println("String 1: " + string1);
        System.out.println("String 2: " + string2);

        // Compare the two strings lexicographically ignoring case
        int result = string1.compareToIgnoreCase(string2);

        // Print the comparison result
        if (result < 0) {
            System.out.println("\"" + string1 + "\" is less than \"" + string2 + "\"");
        } else if (result > 0) {
            System.out.println("\"" + string1 + "\" is greater than \"" + string2 + "\"");
        } else {
            System.out.println("\"" + string1 + "\" is equal to \"" + string2 + "\"");
        }
    }
}
