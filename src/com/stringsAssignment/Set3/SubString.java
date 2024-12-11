
//27. Write a Java program to get a substring of a given string between two specified positions.
//
//Sample Output:
//
//old = The quick brown fox jumps over the lazy dog.
//new = brown fox jumps
package com.stringsAssignment.Set3;

public class SubString {
    public static void main(String[] args) {
        String str="The quick brown fox jumps over the lazy dog";
        String result=str.substring(10,25);
        System.out.println(result);
    }
}
