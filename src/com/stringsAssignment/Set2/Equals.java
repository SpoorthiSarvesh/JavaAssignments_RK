//Write a Java program to check whether two String objects contain the same data.
//
//Sample Output:
//
//        "Stephen Edwin King" equals "Walter Winchell"? false
//        "Stephen Edwin King" equals "Mike Royko"? false
package com.stringsAssignment.Set2;

public class Equals {
    public static void main(String[] args) {
        String str1="Stephen Edwin King";
        String str2="Walter Winchell";
        boolean result=str1.equals(str2);
        System.out.println("\""+str1+"\""+ " equals "+ "\""+str2+"\" ");
        System.out.println(result);

    }
}
