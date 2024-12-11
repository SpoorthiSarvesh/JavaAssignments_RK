//
//5. Write a Java program that takes two numbers as input and displays the product of two numbers.
//Test Data:
//Input first number: 25
//Input second number: 5
//Expected Output :
//        25 x 5 = 125
package com.assignment2;

import java.util.Scanner;

public class ProductOfNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input first number:");
        int first=sc.nextInt();
        System.out.println("Input second number:");
        int second=sc.nextInt();
        int result=first*second;
        System.out.println(result);
    }
}
