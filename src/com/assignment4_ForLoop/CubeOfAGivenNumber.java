//Write a Java program to display the cube of the given number up to an integer.
//
//Test Data
//Input number of terms : 4
//Expected Output :
//
//Number is : 1 and cube of 1 is : 1
//Number is : 2 and cube of 2 is : 8
//Number is : 3 and cube of 3 is : 27
//Number is : 4 and cube of 4 is : 64

package com.assignment4_ForLoop;

import java.util.Scanner;

public class CubeOfAGivenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input number of terms");
        int inputNoOfTerms= sc.nextInt();
        for(int i=1;i<=inputNoOfTerms;i++)
        {
            System.out.println("Number is: "+ i + "and cube of "+ i+ "is : "+ Math.pow(i,3));
        }
    }
}
