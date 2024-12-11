//20. Write a Java program to get the canonical representation of the string object.
//
//Sample Output:
//
//str1 == str2? false
//str1 == str3? true
package com.stringsAssignment.Set2;

public class CanonicalStringExample {
    public static void main(String[] args) {


        String str1 = "Stephen Edwin King";
        String str2 = "Walter Winchell";
        String str3="Stephen Edwin King";
        boolean result=str1==str2;
        boolean result2=str1==str3;
        System.out.println(result);
        System.out.println(result2);
    }

}
