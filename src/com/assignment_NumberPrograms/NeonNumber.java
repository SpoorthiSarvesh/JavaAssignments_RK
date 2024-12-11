package com.assignment_NumberPrograms;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isNeonNumber(number)) {
            System.out.println(number + " is a Neon Number.");
        } else {
            System.out.println(number + " is not a Neon Number.");
        }
    }

    public static boolean isNeonNumber(int number) {
        int square = number * number; // Calculate the square of the number
        int sumOfDigits = 0;

        // Calculate the sum of the digits of the square
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }

        // Check if the sum of the digits equals the original number
        return sumOfDigits == number;
    }
}
