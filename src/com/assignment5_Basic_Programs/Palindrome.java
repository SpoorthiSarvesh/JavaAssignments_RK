//write java program for Palindrome
//Ex:
//Palindrome number in java: A palindrome number is a number that is same after reverse. For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. It can also be a string like LOL, MADAM etc.
package com.assignment5_Basic_Programs;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int num) {
        int originalNumber = num;
        int reversedNumber = 0;

        // Reverse the number
        while (num != 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }

        // Check if the original number is equal to the reversed number
        return originalNumber == reversedNumber;
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        // Compare characters from both ends of the string
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Checking for palindrome number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }

        // Checking for palindrome string
        System.out.print("Enter a string: ");
        scanner.nextLine(); // consume the newline character left after nextInt
        String str = scanner.nextLine();

        if (isPalindrome(str)) {
            System.out.println("\"" + str + "\" is a palindrome string.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome string.");
        }

        scanner.close();
    }
}
