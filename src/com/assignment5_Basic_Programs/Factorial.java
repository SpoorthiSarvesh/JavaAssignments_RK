//write java program for Factorial
//Ex:
//Factorial Program in Java: Factorial of n is the product of all positive descending integers. Factorial of n is denoted by n!. For example:
//
//        4! = 4*3*2*1 = 24
//        5! = 5*4*3*2*1 = 120
package com.assignment5_Basic_Programs;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Handle the edge case for negative numbers
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Start with 1 because multiplying by 1 doesn't change the product
            int result = 1;

            // Multiply result by every number from 1 to num
            for (int i = 1; i <= num; i++) {
                result *= i;  // result = result * i
            }

            // Display the result
            System.out.println("Factorial of " + num + " is: " + result);
        }

        scanner.close();
    }
}
