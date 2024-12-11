//2. Write a Java program to print the sum of two numbers.
//Test Data:
//        74 + 36
//Expected Output :
//        110
package com.assignment2;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input first number:");
        int first=sc.nextInt();
        System.out.println("Input second number:");
        int second=sc.nextInt();
        int addition=first+second;
        System.out.println(addition);
    }
}
