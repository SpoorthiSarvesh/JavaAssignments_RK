package com.assignment_NumberPrograms;

import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = scanner.next();  // Input as String to easily check the first character

        if (isDuckNumber(number)) {
            System.out.println(number + " is a Duck Number.");
        } else {
            System.out.println(number + " is not a Duck Number.");
        }
    }

    // Function to check if the number is a Duck Number
    public static boolean isDuckNumber(String num) {
        // Check if the number does not start with '0' and contains '0' in it
        return num.charAt(0) != '0' && num.contains("0");
    }
}

