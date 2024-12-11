
//11. Write a Java program to print the area and perimeter of a circle.
//Test Data:
//Radius = 7.5
//Expected Output
//Perimeter is = 47.12388980384689
//Area is = 176.71458676442586

package com.assignment2;

import java.util.Scanner;

public class AreaAndPerimeter {
    public static void main(String[] args) {
        float pi=3.14159f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius");
        float radius=sc.nextFloat();
        float perimeter= (2*pi*radius);
        System.out.println("Perimeter is = "+perimeter);
        float area= (pi*radius*radius);
        System.out.println("Area is = "+area);

    }
}
