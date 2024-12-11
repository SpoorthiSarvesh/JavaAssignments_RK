//39. Write a Java program to find first non repeating character in a string.
//
//Sample Output:
//
//The given string is: gibblegabbler
//The first non repeated character in String is: i
package com.stringsAssignment.Set4;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String input = "gibblegabbler";
        System.out.println("The given string is: " + input);

        char result = findFirstNonRepeatingCharacter(input);

        if (result != '\0') {
            System.out.println("The first non-repeated character in the string is: " + result);
        } else {
            System.out.println("There is no non-repeated character in the string.");
        }
    }

    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeatingCharacter(String str) {
        // Use LinkedHashMap to store character counts while preserving order
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count the frequency of each character in the string
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the first character with a count of 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '\0'; // Return null character if no non-repeating character is found
    }
}

