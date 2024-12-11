//3. Write a Java program to get the character (Unicode code point) before the specified index within the String.
//
//Sample Output:
//
//Original String : ramaresource.com
//Character(unicode point) = 119
//Character(unicode point) = 99
package com.stringsAssignment;

public class UnicodeCodePointBefore {
    public static void main(String[] args) {
        String originalString = "ramaresource.com";
        // Print the original string
        System.out.println("Original String : " + originalString);
        // Get the Unicode code point before position 5
        int codePointBefore5 = originalString.codePointBefore(5);
        System.out.println("Character(unicode point) = " + codePointBefore5);
        // Get the Unicode code point before position 12
        int codePointBefore12 = originalString.codePointBefore(12);
        System.out.println("Character(unicode point) = " + codePointBefore12);
    }
    }

