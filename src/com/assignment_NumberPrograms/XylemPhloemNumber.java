package com.assignment_NumberPrograms;

import java.util.Scanner;

public class XylemPhloemNumber {

    // Function to calculate the sum of digits of a number
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    // Function to calculate the sum of the squares of digits of a number
    public static int sumOfSquaresOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        return sum;
    }

    // Function to calculate the sum of the cubes of digits of a number
    public static int sumOfCubesOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        return sum;
    }

    // Function to calculate the sum of the digits raised to the power of 4
    public static int sumOfDigitsRaisedToFourthPower(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 4);
            number /= 10;
        }
        return sum;
    }

    // Function to check if a number is a Xylem Number
    public static boolean isXylemNumber(int number) {
        int sumDigits = sumOfDigits(number);
        int sumSquaresDigits = sumOfSquaresOfDigits(number);
        return sumDigits == sumSquaresDigits;
    }

    // Function to check if a number is a Phloem Number
    public static boolean isPhloemNumber(int number) {
        int sumCubesDigits = sumOfCubesOfDigits(number);
        int sumDigitsPowerFour = sumOfDigitsRaisedToFourthPower(number);
        return sumCubesDigits == sumDigitsPowerFour;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a Xylem Number
        if (isXylemNumber(number)) {
            System.out.println(number + " is a Xylem Number.");
        } else {
            System.out.println(number + " is not a Xylem Number.");
        }

        // Check if the number is a Phloem Number
        if (isPhloemNumber(number)) {
            System.out.println(number + " is a Phloem Number.");
        } else {
            System.out.println(number + " is not a Phloem Number.");
        }

        scanner.close();
    }
}
