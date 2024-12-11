package com.assignment_NumberPrograms;

import java.util.Scanner;

public class BuzzNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isBuzzNumber(number)) {
            System.out.println(number + " is a Buzz Number.");
        } else {
            System.out.println(number + " is not a Buzz Number.");
        }
    }

    // Function to check if the number is a Buzz Number
    public static boolean isBuzzNumber(int num) {
        // Check if the number ends with 7 or is divisible by 7
        return num % 10 == 7 || num % 7 == 0;
    }
}

