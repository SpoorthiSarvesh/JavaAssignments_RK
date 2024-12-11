package com.assignment_NumberPrograms;

import java.util.Scanner;

public class EmirpNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPrime(number) && isPrime(reverseNumber(number)) && number != reverseNumber(number)) {
            System.out.println(number + " is an Emirp Number.");
        } else {
            System.out.println(number + " is not an Emirp Number.");
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Function to reverse a number
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}

