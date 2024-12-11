//31. Write a Java program to trim any leading or trailing whitespace from a given string.
//
//Sample Output:
//
//Original String:  Java Exercises
//New String: Java Exercises
package com.stringsAssignment.Set4;

public class Trim {
    public static void main(String[] args) {
        String str="     I LOVE YOU NIDHI SANVITHA     ";
        String result=str.trim();
        System.out.println(str);
        System.out.println(result);
    }
}
