//2. Write a Java program to get the character (Unicode code point) at the given index within the String.
//
//Sample Output:
//
//Original String : google.com
//Character(unicode point) = 51
//Character(unicode point) = 10
package com.stringsAssignment;

public class UnicodeCodePoint {
    public static void main(String[] args) {
        String str="google.com ";
        int unicode1=str.codePointAt(0);
        int unicode2=str.codePointAt(1);
        System.out.println("Code Point at Index 0: "+unicode1);
        System.out.println("Code Point at Index 1: "+unicode2);
    }
}
