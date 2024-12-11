package com.assignment_NumberPrograms;

import java.util.Scanner;

public class SmithNumber {

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to find the sum of digits of a number
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    // Function to get the prime factors of a number
    public static int[] primeFactors(int number) {
        int[] factors = new int[50]; // To store prime factors
        int index = 0;

        // Check for number of 2s
        while (number % 2 == 0) {
            factors[index++] = 2;
            number /= 2;
        }

        // Check for odd numbers
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                factors[index++] = i;
                number /= i;
            }
        }

        // If number is prime and greater than 2
        if (number > 2) {
            factors[index++] = number;
        }

        // Return only the valid factors
        int[] validFactors = new int[index];
        for (int i = 0; i < index; i++) {
            validFactors[i] = factors[i];
        }

        return validFactors;
    }

    // Function to check if a number is a Smith Number
    public static boolean isSmithNumber(int number) {
        if (isPrime(number)) {
            return false; // A prime number is not a Smith Number
        }

        // Sum of digits of the number
        int sumDigits = sumOfDigits(number);

        // Sum of digits of prime factors
        int sumPrimeFactorsDigits = 0;
        int[] factors = primeFactors(number);
        for (int factor : factors) {
            sumPrimeFactorsDigits += sumOfDigits(factor);
        }

        return sumDigits == sumPrimeFactorsDigits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a Smith Number
        if (isSmithNumber(number)) {
            System.out.println(number + " is a Smith Number.");
        } else {
            System.out.println(number + " is not a Smith Number.");
        }

        scanner.close();
    }
}
