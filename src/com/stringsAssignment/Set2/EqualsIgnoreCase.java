//Write a Java program to compare a given string to another string, ignoring case considerations.
//
//Sample Output:
//
//        "Stephen Edwin King" equals "Walter Winchell"? false
//        "Stephen Edwin King" equals "stephen edwin king"? true
package com.stringsAssignment.Set2;

public class EqualsIgnoreCase {
    public static void main(String[] args) {


        String str1 = "Stephen Edwin King";
        String str2 = "stephen edwin king";
        boolean result = str1.equalsIgnoreCase(str2);
        System.out.println("\"" + str1 + "\"" + " equals " + "\"" + str2 + "\" ");
        System.out.println(result);
    }

}
