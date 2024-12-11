package com.patternANDMatches;

import java.util.regex.Pattern;

public class SplitExample {
    public static void main(String[] args) {
        String input = "one, two; three";
        String regex = "[,; ]+"; // Matches commas, semicolons, or spaces

        Pattern pattern = Pattern.compile(regex);
        String[] result = pattern.split(input);

        for (String word : result) {
            System.out.println(word); // Output: one  two  three
        }
    }
}
