package com.assignment5b_NumberProgram;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345;  // Example number to reverse
        int reversedNumber = 0;

        // Loop until the number becomes 0
        while (number != 0) {
            // Get the last digit
            int digit = number % 10;

            // Shift the reversed number left by one position and add the digit
            reversedNumber = reversedNumber * 10 + digit;

            // Remove the last digit from the original number
            number /= 10;
        }

        // Output the reversed number
        System.out.println("Reversed number: " + reversedNumber);
    }
}
