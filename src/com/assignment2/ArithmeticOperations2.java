
//6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
//Test Data:
//Input first number: 125
//Input second number: 24
//Expected Output :
//        125 + 24 = 149
//        125 - 24 = 101
//        125 x 24 = 3000
//        125 / 24 = 5
//        125 mod 24 = 5
package com.assignment2;

import java.util.Scanner;

public class ArithmeticOperations2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input first number:");
        int first=sc.nextInt();
        System.out.println("Input second number:");
        int second=sc.nextInt();
        int addition=first+second;
        int sub=first-second;
        int mul=first*second;
        int div=first/second;
        int mod=first%second;
        System.out.println(addition);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);
    }
}
