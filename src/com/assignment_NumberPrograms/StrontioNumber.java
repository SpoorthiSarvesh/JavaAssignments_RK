package com.assignment_NumberPrograms;

import java.util.Scanner;

public class StrontioNumber {

    // Function to calculate the sum of digits of a number
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    // Function to calculate the sum of squares of the digits of a number
    public static int sumOfSquaresOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        return sum;
    }

    // Function to check if a number is a Strontio Number
    public static boolean isStrontioNumber(int number) {
        // Calculate the sum of digits
        int sumDigits = sumOfDigits(number);

        // Calculate the sum of squares of digits
        int sumSquaresDigits = sumOfSquaresOfDigits(number);

        // Check if the sum of squares of digits is equal to the square of the sum of digits
        return sumSquaresDigits == sumDigits * sumDigits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a Strontio Number
        if (isStrontioNumber(number)) {
            System.out.println(number + " is a Strontio Number.");
        } else {
            System.out.println(number + " is not a Strontio Number.");
        }

        scanner.close();
    }
}
