//6. Write a Java program to compute the body mass index (BMI).
//Test Data
//Input weight in pounds: 452
//Input height in inches: 72
//Expected Output:
//Body Mass Index is 61.30159143458721
package com.assignment1;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input weight in pounds:");
        int weight=sc.nextInt();
        System.out.println("Input height in inches:");
        int height=sc.nextInt();
        double bodyMassIndex= (double) weight*703 /(height*height);
        System.out.println("Body Mass Index is "+  bodyMassIndex);

    }
}
