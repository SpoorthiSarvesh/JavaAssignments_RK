package com.patternANDMatches;

import java.util.regex.Pattern;

public class FullStringMatching {
    public static void main(String[] args) {
        String input = "hello123";
        String regex = "[a-z]+\\d+"; // Matches letters followed by digits

        boolean result = Pattern.matches(regex, input);
        System.out.println("Full match: " + result); // Output: true
    }
}
