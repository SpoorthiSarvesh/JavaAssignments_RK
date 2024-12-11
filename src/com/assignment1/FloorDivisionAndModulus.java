//13. Write a Java program to compute the floor division and floor modulus of the given dividend and divisor.
package com.assignment1;

import java.util.Scanner;

public class FloorDivisionAndModulus {
    public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
            System.out.print("Enter the dividend: ");
            int dividend = sc.nextInt();
            System.out.print("Enter the divisor: ");
            int divisor = sc.nextInt();

            int floorDivision = Math.floorDiv(dividend, divisor);
            int floorModulus = Math.floorMod(dividend, divisor);


            System.out.println("Floor division of " + dividend + " by " + divisor + " is: " + floorDivision);
            System.out.println("Floor modulus of " + dividend + " by " + divisor + " is: " + floorModulus);


        }
    }

