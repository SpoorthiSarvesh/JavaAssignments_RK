//Write a Java program to replace a specified character with another character.
//
//Sample Output:
//
//Original string: The quick brown fox jumps over the lazy dog.
//New String: The quick brown fox jumps over the lazy fog.
package com.stringsAssignment.Set3;

public class Replace {
    public static void main(String[] args) {
        String str="The quick brown fox jumps over the lazy dog.";
        String newString=str.replace('d','f');
        System.out.println(str);
        System.out.println(newString);

    }
}
