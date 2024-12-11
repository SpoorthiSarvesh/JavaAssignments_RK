//26. Write a Java program to check whether a given string starts with the contents of another string.
//
//Sample Output:
//
//Red is favorite color. starts with Red? true
//Orange is also my favorite color. starts with Red? false
package com.stringsAssignment.Set3;

public class StartsWith {
    public static void main(String[] args) {
        String str="Red is favorite color.";
        boolean result=str.startsWith("hjk");
        System.out.println(result);
    }
}
