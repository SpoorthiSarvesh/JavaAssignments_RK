//Java Program to Find Smallest of Three Numbers Using Ternary Operator
package com.assignment5b_NumberProgram;

public class SmallestOf3Numbers {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 5;  // Example numbers

        // Find the smallest using the ternary operator
        int smallest = (num1 < num2) ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3);

        // Print the result
        System.out.println("The smallest number is: " + smallest);
    }
}
