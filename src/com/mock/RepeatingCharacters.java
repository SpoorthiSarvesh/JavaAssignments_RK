package com.mock;

public class RepeatingCharacters {
    public static void main(String[] args) {
        String input = "programming"; // Change this string if needed
        System.out.println("Repeating characters:");

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (input.indexOf(c) != i) { // Check if the character appears before
                System.out.println(c);
            }
        }
    }
}  