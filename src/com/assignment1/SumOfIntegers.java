//
//3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits sum in the integer.
//        Test Data
//Input an integer between 0 and 1000: 565
//Expected Output :
//The sum of all digits in 565 is 16

package com.assignment1;

import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input an integer between 0 and 1000: ");
        int number= sc.nextInt();
        int hundreds=(number/100)%10;
        int tens=(number/10)%10;
        int units=(number)%10;
        int sum=hundreds+tens+units;


        System.out.println("The sum of all digits in "+ number+" is "+ sum);
    }
}
