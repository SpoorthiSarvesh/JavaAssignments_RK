//12. Write a Java program to check whether a given string ends with the contents of another string.
//
//Sample Output:
//
//        "Python Exercises" ends with "se"? false
//        "Python Exercise" ends with "se"? true
package com.stringsAssignment.Set2;

public class EndsWith {
    public static void main(String[] args) {
        String str1="Python Exercises";
        String str2="Python Exercise";
        boolean result1=str1.endsWith("se");
        boolean result2=str2.endsWith("se");

        System.out.println("\""+str1+"\""+" ends with "+"se "+result1);
        System.out.println("\""+str2+"\""+"ends with "+"se "+result2);
    }
}
