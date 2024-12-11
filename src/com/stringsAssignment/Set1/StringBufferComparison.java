//10. Write a Java program to compare a given string to the specified string buffer.
//
//Sample Output:
//
//Comparing example.com and example.com: true
//Comparing Example.com and example.com: false
package com.stringsAssignment;

public class StringBufferComparison {
    public static void main(String[] args) {
        // Define a string and a StringBuffer
        String string1 = "example.com";
        StringBuffer stringBuffer1 = new StringBuffer("example.com");

        // Define another string and StringBuffer with different case
        String string2 = "Example.com";
        StringBuffer stringBuffer2 = new StringBuffer("example.com");

        // Compare the string and StringBuffer using equals() method (case-sensitive)
        System.out.println("Comparing " + string1 + " and " + stringBuffer1 + ": " + string1.equals(stringBuffer1.toString()));
        System.out.println("Comparing " + string2 + " and " + stringBuffer2 + ": " + string2.equals(stringBuffer2.toString()));

        // Using equalsIgnoreCase() for case-insensitive comparison
        System.out.println("Comparing " + string2 + " and " + stringBuffer2 + " (case-insensitive): " + string2.equalsIgnoreCase(stringBuffer2.toString()));
    }
}
