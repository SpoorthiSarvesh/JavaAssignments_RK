//9. Write a Java program that accepts two integers from the user and prints the sum, the difference, the product, the average, the distance (the difference between the integers), the maximum (the largest of the two integers), and the minimum (the smallest of the two integers).
//
//Test Data
//Input 1st integer: 25
//Input 2nd integer: 5
//Expected Output :
//Sum of two integers: 30
//Difference of two integers: 20
//Product of two integers: 125
//Average of two integers: 15.00
//Distance of two integers: 20
//Max integer: 25
//Min integer: 5
package com.assignment1;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input 1st integer:");
        int firstInt=sc.nextInt();
        System.out.println("Input 2nd integer:");
        int secondInt=sc.nextInt();
        System.out.println("Sum of two integers: "+Math.addExact(firstInt,secondInt));
        System.out.println("Difference of two integers: "+Math.subtractExact(firstInt,secondInt));
        System.out.println("Product  of two integers: "+Math.multiplyExact(firstInt,secondInt));
        int average=(firstInt+secondInt)/2;
        System.out.println("Average of two integers: "+average);
        int distance=secondInt-firstInt;
        System.out.println("Distance of two integers "+distance);
        System.out.println("Max of two integers: "+Math.max(firstInt,secondInt));
        System.out.println("Min of two integers: "+Math.min(firstInt,secondInt));

    }
}
