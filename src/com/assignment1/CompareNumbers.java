package com.assignment1;

//12. Write a Java program to compare two signed and unsigned numbers.
public class CompareNumbers {

    public static void main(String[] args) {
        int signedNum1 = -50;
        int signedNum2 = 25;
        long unsignedNum1 = 50;
        long unsignedNum2 = 25;

        if (signedNum1 < signedNum2) {
            System.out.println("signedNum1 is less than signedNum2");
        } else {
            System.out.println("signedNum1 is equal to signedNum2");
        }

        if (unsignedNum1 > unsignedNum2) {
            System.out.println("unsignedNum1 is greater than unsignedNum2");
        } else if (unsignedNum1 < unsignedNum2) {
            System.out.println("unsignedNum1 is less than unsignedNum2");
        } else {
            System.out.println("unsignedNum1 is equal to unsignedNum2");
        }
    }
}

