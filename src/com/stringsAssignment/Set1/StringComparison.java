//
//9. Write a Java program to compare a given string to the specified character sequence.
//
//Sample Output:
//
//Comparing example.com and example.com: true
//Comparing Example.com and example.com: false
package com.stringsAssignment;

public class StringComparison {
    public static void main(String[] args) {
        String str1="example.com";
        String str2="Example.com";
        boolean result=str1==str2;
        System.out.println(result);

    }
}
