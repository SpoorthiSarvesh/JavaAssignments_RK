package com.patternANDMatches;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceExample {
    public static void main(String[] args) {
        String input = "hello123world456";
        String regex = "\\d+"; // Matches one or more digits

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        String result = matcher.replaceAll("#");
        System.out.println(result); // Output: hello#world#
    }
}
