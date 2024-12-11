//Java Program to Find Sum of Natural Numbers
package com.assignment5b_NumberProgram;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        int sum=0;
        for (int i=1;i<=n;i++)
        {
           sum+=i;

        }
        System.out.println("The sum of natural number "+n+" is "+sum);
    }
}
