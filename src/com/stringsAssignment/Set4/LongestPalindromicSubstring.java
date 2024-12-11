package com.stringsAssignment.Set4;

//32. Write a Java program to find longest Palindromic Substring within a string.
//
//Sample Output:
//
//The given string is: thequickbrownfoxxofnworbquickthe
//The longest palindrome substring in the given string is; brownfoxxofnworb
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String input = "babad"; // Input string
        System.out.println("Longest Palindromic Substring: " + findLongestPalindrome(input));
    }

    public static String findLongestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            // Check for odd-length palindromes
            String oddPalindrome = expandAroundCenter(s, i, i);

            // Check for even-length palindromes
            String evenPalindrome = expandAroundCenter(s, i, i + 1);

            // Keep track of the longest palindrome
            if (oddPalindrome.length() > longest.length()) {
                longest = oddPalindrome;
            }
            if (evenPalindrome.length() > longest.length()) {
                longest = evenPalindrome;
            }
        }
        return longest;
    }

    private static String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right); // Extract the palindrome
    }
}