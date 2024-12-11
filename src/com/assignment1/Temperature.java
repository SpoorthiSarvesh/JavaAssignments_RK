//1. Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
//Test Data
//Input a degree in Fahrenheit: 212
//Expected Output:
//        212.0 degree Fahrenheit is equal to 100.0 in Celsius
package com.assignment1;

public class Temperature {
    public static void main(String[] args) {
        float fahrenheit=212.0f;
        float celsius=((fahrenheit-32)*5)/9;
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius ");
    }
}
