//6. Write a Java program to find the index of an array element
package com.arraysAssignment;

public class IndexOfAnElement {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50};
        int target = 10;
        int index = -1;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("Index of " + target + ": " + index);
    }
    }

