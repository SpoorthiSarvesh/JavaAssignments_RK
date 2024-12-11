//How to Compare Two Objects in Java
package com.assignment5_Basic_Programs;

import java.util.Objects;

public class Compare2Objects {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        if (Objects.equals(str1, str2)) {
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
    }
}
