//37. Write a Java program to find length of the longest substring of a given string without repeating characters.
//
//Sample Output:
//
//Input String : pickoutthelongestsubstring
//The longest substring : [u, b, s, t, r, i, n, g]
//The longest Substring Length : 8
package com.stringsAssignment.Set4;

import java.util.HashSet;

public class LongestUniqueSubstring {

    public static void main(String[] args) {
        String input = "pickoutthelongestsubstring";
        System.out.println("Input String: " + input);

        String longestSubstring = findLongestUniqueSubstring(input);
        System.out.println("The longest substring: " + longestSubstring);
        System.out.println("The longest Substring Length: " + longestSubstring.length());
    }

    // Method to find the longest substring without repeating characters
    public static String findLongestUniqueSubstring(String str) {
        int maxLength = 0;
        int start = 0;
        String longestSubstring = "";

        // Use a set to track unique characters
        HashSet<Character> uniqueChars = new HashSet<>();

        for (int end = 0; end < str.length(); end++) {
            // If character is already in the set, remove characters from the start
            while (uniqueChars.contains(str.charAt(end))) {
                uniqueChars.remove(str.charAt(start));
                start++;
            }

            // Add the current character to the set
            uniqueChars.add(str.charAt(end));

            // Check if the current substring is the longest
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                longestSubstring = str.substring(start, end + 1);
            }
        }

        return longestSubstring;
    }
}
