//
//34. Write a Java program to find the second most frequent character in a given string.
//
//Sample Output:
//
//The given string is: successes
//The second most frequent char in the string is: c
package com.stringsAssignment.Set4;

import java.util.HashMap;
import java.util.Map;

public class SecondMostFrequentChar {

    public static void main(String[] args) {
        String input = "successes";

        System.out.println("The given string is: " + input);

        // Count the frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find the most and second most frequent characters
        char mostFrequent = '\0', secondMostFrequent = '\0';
        int highestFrequency = 0, secondHighestFrequency = 0;

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            char character = entry.getKey();

            if (frequency > highestFrequency) {
                // Update second highest frequency and character
                secondHighestFrequency = highestFrequency;
                secondMostFrequent = mostFrequent;

                // Update highest frequency and character
                highestFrequency = frequency;
                mostFrequent = character;
            } else if (frequency > secondHighestFrequency && frequency != highestFrequency) {
                // Update only the second highest frequency and character
                secondHighestFrequency = frequency;
                secondMostFrequent = character;
            }
        }

        System.out.println("The second most frequent char in the string is: " + secondMostFrequent);
    }
}
