//Write a Java program to display the pattern like a diamond.
//
//        Test Data
//Input number of rows (half of the diamond) : 7
//Expected Output :
//
//

package com.assignment4_ForLoop;

public class Pattern {
    public static void main(String[] args) {
        int rows = 5;


        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
