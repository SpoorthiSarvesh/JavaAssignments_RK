
//
//13. Write a Java program to print the area and perimeter of a rectangle.
//Test Data:
//Width = 5.5 Height = 8.5
//
//
//Expected Output
//Area is 5.6 * 8.5 = 47.60
//Perimeter is 2 * (5.6 + 8.5) = 28.20
package com.assignment2;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Width:");
        float width = sc.nextFloat();
        System.out.println("Height:");
        float height = sc.nextFloat();
        float area=width*height;
        float perimeter=2*(width+height);
        System.out.println("Area is: "+area);
        System.out.println("Perimeter is: "+perimeter);

    }
}

