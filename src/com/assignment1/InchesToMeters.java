//2. Write a Java program that reads a number in inches and converts it to meters.
//        Note: One inch is 0.0254 meter.
//        Test Data
//Input a value for inch: 1000
//Expected Output :
//        1000.0 inch is 25.4 meters

package com.assignment1;

import java.util.Scanner;

public class InchesToMeters {
    public static void main(String[] args) {

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Input a value for inch");
//        int inch=sc.nextInt();
//        double meter=inch/39.37;
//        System.out.println(inch+" inch is "+ meter+" meters.");

        //OR

        int inch=1000;
        double meter=inch/39.37;
        System.out.println(inch+" inch is "+ meter+" meters.");

    }
}
