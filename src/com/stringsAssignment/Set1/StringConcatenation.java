//7. Write a Java program to concatenate a given string to the end of another string.
//
//Sample Output:
//
//String 1: PHP Exercises and
//String 2: Python Exercises
//The concatenated string: PHP Exercises and Python Exercises
package com.stringsAssignment;

public class StringConcatenation {
    public static void main(String[] args) {
        String str1="PHP Exercises and ";
        String str2="Python Exercises";
        System.out.println("The concatenated string:  " + str1.concat(str2));
    }
}
