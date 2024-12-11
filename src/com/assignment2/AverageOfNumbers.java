//12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
package com.assignment2;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int first = sc.nextInt();
        System.out.println("Enter second number");
        int second = sc.nextInt();
        System.out.println("Enter third number");
        int third = sc.nextInt();
        int result = (first + second + third) / 3;
        System.out.println("Average is: " + result);
    }
}
