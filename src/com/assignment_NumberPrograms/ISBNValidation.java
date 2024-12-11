package com.assignment_NumberPrograms;

import java.util.Scanner;

public class ISBNValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ISBN-13 Number: ");
        String isbn = scanner.nextLine();

        if (isValidISBN(isbn)) {
            System.out.println(isbn + " is a valid ISBN-13 number.");
        } else {
            System.out.println(isbn + " is not a valid ISBN-13 number.");
        }
    }

    // Function to validate ISBN-13 number
    public static boolean isValidISBN(String isbn) {
        // Check if ISBN is 13 digits long
        if (isbn.length() != 13 || !isbn.matches("[0-9]+")) {
            return false;
        }

        int sum = 0;

        // Loop through the first 12 digits and apply the alternate multiplier of 1 and 3
        for (int i = 0; i < 12; i++) {
            int digit = Character.getNumericValue(isbn.charAt(i));
            if (i % 2 == 0) {
                sum += digit; // Multiply by 1
            } else {
                sum += digit * 3; // Multiply by 3
            }
        }

        // Calculate the checksum by checking the last digit
        int lastDigit = Character.getNumericValue(isbn.charAt(12));
        int checkSum = (10 - (sum % 10)) % 10;

        // If the checksum matches the last digit, the ISBN is valid
        return lastDigit == checkSum;
    }
}

