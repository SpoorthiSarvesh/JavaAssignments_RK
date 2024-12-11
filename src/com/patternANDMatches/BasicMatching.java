package com.patternANDMatches;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicMatching {
    public static void main(String[] args) {
        String input = "hello123";
        String regex = "\\d+"; // Matches one or more digits

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            System.out.println("Match found: " + matcher.group()); // Output: 123
        } else {
            System.out.println("No match found.");
        }
    }
}
