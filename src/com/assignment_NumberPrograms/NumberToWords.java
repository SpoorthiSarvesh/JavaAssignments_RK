//Java Program to convert Number to Word
package com.assignment_NumberPrograms;

import java.util.Scanner;

public class NumberToWords {
    // Words for single digits
    private static final String[] units = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
    };

    // Words for tens
    private static final String[] teens = {
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
            "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (0-9999): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 9999) {
            System.out.println("Please enter a number between 0 and 9999.");
        } else if (number == 0) {
            System.out.println("The number in words: Zero");
        } else {
            System.out.println("The number in words: " + convertToWords(number));
        }
    }

    // Convert a number to words
    private static String convertToWords(int number) {
        if (number >= 1000) {
            return units[number / 1000] + " Thousand " + convertToWords(number % 1000);
        } else if (number >= 100) {
            return units[number / 100] + " Hundred " + convertToWords(number % 100);
        } else if (number >= 20) {
            return tens[number / 10] + " " + units[number % 10];
        } else if (number >= 10) {
            return teens[number - 10];
        } else {
            return units[number];
        }
    }
}
