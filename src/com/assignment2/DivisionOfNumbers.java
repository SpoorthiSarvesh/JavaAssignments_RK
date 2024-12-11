//3. Write a Java program to divide two numbers and print them on the screen.
//Test Data :
//        50/3
//Expected Output :
//        16
package com.assignment2;

import java.util.Scanner;

public class DivisionOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        float first = sc.nextFloat();
        System.out.println("Enter second number");
        float second = sc.nextFloat();
        float result=first/second;
        System.out.println(result);
    }
}
