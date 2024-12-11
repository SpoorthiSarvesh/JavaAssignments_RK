//
//36. Write a Java program to check whether two strings are interliving of a given string. Assuming that the unique characters in both strings.
//
//Sample Output:
//
//The given string is: PMQNO
//The interleaving strings are MNO and PQ
//The given string is interleaving: true
//
//The given string is: PNQMO
//The interleaving strings are MNO and PQ
//The given string is interleaving: false

package com.stringsAssignment.Set4;

public class InterleavingStrings {

    public static void main(String[] args) {
        String givenString1 = "PMQNO";
        String string1 = "MNO";
        String string2 = "PQ";

        System.out.println("The given string is: " + givenString1);
        System.out.println("The interleaving strings are " + string1 + " and " + string2);
        System.out.println("The given string is interleaving: " + isInterleaving(givenString1, string1, string2));

        String givenString2 = "PNQMO";
        System.out.println("\nThe given string is: " + givenString2);
        System.out.println("The interleaving strings are " + string1 + " and " + string2);
        System.out.println("The given string is interleaving: " + isInterleaving(givenString2, string1, string2));
    }

    // Function to check if s3 is an interleaving of s1 and s2
    public static boolean isInterleaving(String s3, String s1, String s2) {
        // Check length
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }

        // Use two pointers for s1 and s2
        int i = 0, j = 0;

        for (int k = 0; k < s3.length(); k++) {
            char current = s3.charAt(k);

            if (i < s1.length() && current == s1.charAt(i)) {
                i++;
            } else if (j < s2.length() && current == s2.charAt(j)) {
                j++;
            } else {
                return false; // Character does not match s1 or s2
            }
        }

        // All characters matched correctly
        return true;
    }
}
