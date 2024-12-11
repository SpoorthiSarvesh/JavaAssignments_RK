
//11. Write a Java program to test whether a given double/float value is a finite floating-point value or not.

package com.assignment1;

import java.util.Scanner;

public class FloatDoubleFiniteOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a double/float value");
        double value= sc.nextDouble();
        if(Double.isFinite(value))
        {
            System.out.println(value+ " is a finite value");
        }
        else
        {
            System.out.println(value+ " is not a finite value");
        }
    }
}
