package com.assignment_NumberPrograms;

import java.util.Scanner;

public class MysteryNumber {

    // Function to check if a number is a Mystery Number
    public static boolean isMysteryNumber(int number) {
        int originalNumber = number;  // Store the original number
        int sumOfCubes = 0;

        // Loop through the number and extract each digit
        while (number != 0) {
            int digit = number % 10;  // Extract the last digit
            sumOfCubes += Math.pow(digit, 3);  // Add the cube of the digit to the sum
            number /= 10;  // Remove the last digit
        }

        // Check if the sum of cubes equals the original number
        return sumOfCubes == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a Mystery Number
        if (isMysteryNumber(number)) {
            System.out.println(number + " is a Mystery Number.");
        } else {
            System.out.println(number + " is not a Mystery Number.");
        }

        scanner.close();
    }
}

