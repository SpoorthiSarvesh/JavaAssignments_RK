//
//33. Write a Java program to find all interleavings of given strings.
//
//Sample Output:
//
//The given strings are: WX  YZ
//The interleavings strings are:
//YWZX
//WYZX
//YWXZ
//WXYZ
//YZWX
//WYXZ
package com.stringsAssignment.Set4;

import java.util.HashSet;
import java.util.Set;

public class StringInterleaving {

    // Method to find all interleavings of two strings
    public static void findInterleavings(String str1, String str2, String result, Set<String> interleavings) {
        // If both strings are empty, add the result to the set
        if (str1.isEmpty() && str2.isEmpty()) {
            interleavings.add(result);
            return;
        }

        // If the first string is not empty, include its first character
        if (!str1.isEmpty()) {
            findInterleavings(str1.substring(1), str2, result + str1.charAt(0), interleavings);
        }

        // If the second string is not empty, include its first character
        if (!str2.isEmpty()) {
            findInterleavings(str1, str2.substring(1), result + str2.charAt(0), interleavings);
        }
    }

    public static void main(String[] args) {
        // Input strings
        String str1 = "WX";
        String str2 = "YZ";

        System.out.println("The given strings are: " + str1 + "  " + str2);

        // Set to store interleavings (to avoid duplicates)
        Set<String> interleavings = new HashSet<>();

        // Find all interleavings
        findInterleavings(str1, str2, "", interleavings);

        System.out.println("The interleaving strings are:");
        for (String interleaving : interleavings) {
            System.out.println(interleaving);
        }
    }
}