//Java Program to Display Odd Numbers From 1 to 100
package com.assignment5b_NumberProgram;

public class OddNumberDisplay {
    public static void main(String[] args) {
        System.out.println("Odd numbers are");
        for (int i=1;i<=100;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
    }
}
