//
//25. Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.
//
//Sample string : "The quick brown fox jumps over the lazy dog."
//
//In the above string replace all the fox with cat.
//
//Sample Output:
//
//Original string: The quick brown fox jumps over the lazy dog.
//New String: The quick brown cat jumps over the lazy dog.
package com.stringsAssignment.Set3;

public class ReplaceAll {
    public static void main(String[] args) {
        String str="The quick brown fox jumps over the lazy dog.";
        String newString=str.replaceAll("fox","cat");
        System.out.println(str);
        System.out.println(newString);
    }
}
