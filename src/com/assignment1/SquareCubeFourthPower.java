//8. Write a Java program that reads a number and displays the square, cube, and fourth power.
//
//Expected Output:
//Square: .2f
//Cube: .2f
//Fourth power: 50625.00
package com.assignment1;

import java.util.Scanner;

public class SquareCubeFourthPower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        System.out.println("Square of a number "+ number+" is "+Math.pow(number,2));
        System.out.println("cube of a number "+ number+" is "+Math.pow(number,3));
        System.out.println("Fourth of a number "+ number+" is "+Math.pow(number,4));
    }
}
