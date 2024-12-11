//4. Write a Java program to count a number of Unicode code points in the specified text range of a String.
//
//Sample Output:
//
//Original String : ramaresource.com
//Codepoint count = 9
package com.stringsAssignment;

public class UnicodeCodePointCount {
    public static void main(String[] args) {
        // Define the original string
        String originalString = "ramaresource.com";

        // Print the original string
        System.out.println("Original String : " + originalString);

        // Define the text range (beginIndex, endIndex) to count code points
        int beginIndex = 0;  // Start from the first character
        int endIndex = 15;   // End at index 15 (exclusive)

        // Get the number of Unicode code points in the specified range
        int codePointCount = originalString.codePointCount(beginIndex, endIndex);

        // Print the code point count
        System.out.println("Codepoint count = " + codePointCount);
    }
}
