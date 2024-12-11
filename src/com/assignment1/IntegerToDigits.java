//
//
//10. Write a Java program to break an integer into a sequence of digits.
//
//        Test Data
//Input six non-negative digits: 123456
//Expected Output :
//        1 2 3 4 5 6
package com.assignment1;

import java.util.Scanner;

public class IntegerToDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input six non-negative digits:");
        int integerNumber = sc.nextInt();
        String numberStr = Integer.toString(integerNumber);
        String result = String.join(" ", numberStr.split(""));
        System.out.println(result);
    }
}

