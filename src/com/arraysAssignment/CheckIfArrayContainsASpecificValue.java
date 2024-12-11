//5. Write a Java program to test if an array contains a specific value.


package com.arraysAssignment;

public class CheckIfArrayContainsASpecificValue {
    public static void main(String[] args) {

        int[] num = {10, 20, 30, 40, 50};
        int target = 30;
        boolean contains = false;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) {
                contains = true;
                break;
            }
        }
        if (contains) {
            System.out.println("The array contains the value: " + target);
        } else {
            System.out.println("The array does not contain the value: " + target);
        }
    }
}
