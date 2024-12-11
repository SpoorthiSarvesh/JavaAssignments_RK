//How to Print ASCII Value in Java
package com.assignment5_Basic_Programs;

public class ASCIIValue {

        public static void main(String[] args) {
            // Print ASCII values of characters from 'A' to 'Z'
            for (char c = 'A'; c <= 'Z'; c++) {
                System.out.println("The ASCII value of '" + c + "' is: " + (int) c);
            }
        }
    }

