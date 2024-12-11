//How to Generate Random Number in Java
package com.assignment5_Basic_Programs;

public class RandomNumber {
    public static void main(String[] args) {
        // Generate a random integer between 0 and 9 (inclusive)
        int randomInt = (int)(Math.random() * 10); // (0 <= randomInt < 10)
        System.out.println("Random integer between 0 and 9: " + randomInt);
    }
}
