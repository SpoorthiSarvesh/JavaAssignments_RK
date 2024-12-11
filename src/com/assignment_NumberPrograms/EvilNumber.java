package com.assignment_NumberPrograms;

import java.util.Scanner;

public class EvilNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isEvilNumber(number)) {
            System.out.println(number + " is an Evil Number.");
        } else {
            System.out.println(number + " is not an Evil Number.");
        }
    }

    // Function to check if the number is an Evil Number
    public static boolean isEvilNumber(int num) {
        // Convert the number to binary string
        String binaryRepresentation = Integer.toBinaryString(num);

        // Count the number of 1s in the binary string
        int countOnes = 0;
        for (char c : binaryRepresentation.toCharArray()) {
            if (c == '1') {
                countOnes++;
            }
        }

        // If the count of 1s is even, it's an Evil Number
        return countOnes % 2 == 0;
    }
}
