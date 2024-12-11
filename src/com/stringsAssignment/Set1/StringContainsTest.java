//8. Write a Java program to test if a given string contains the specified sequence of char values.
//
//Sample Output:
//
//Original String: PHP Exercises and Python Exercises
//Specified sequence of char values: and
//true
package com.stringsAssignment;

public class StringContainsTest {
    public static void main(String[] args) {
        String str= "PHP Exercises and Python Exercises";
        System.out.println(str.contains("and"));
    }
}
