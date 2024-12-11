//Automorphic Number Program in Java

package com.assignment_NumberPrograms;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isAutomorphic(number)) {
            System.out.println(number + " is an Automorphic Number.");
        } else {
            System.out.println(number + " is not an Automorphic Number.");
        }
    }

    public static boolean isAutomorphic(int number) {
        int square = number * number;

        // Convert both number and square to strings for easy comparison
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);

        // Check if the square ends with the number
        return squareStr.endsWith(numStr);
    }
}

