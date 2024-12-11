package com.spooPractice;

import java.util.Arrays;
import java.util.SortedMap;

public class Practice {
    public static void main(String[] args) {
        int[] originalArray={10,60,90};
        int[] copiedArray=new int[originalArray.length];
        for (int i=0;i< originalArray.length;i++){
            copiedArray=originalArray;
        }
        System.out.println(Arrays.toString(originalArray));
        System.out.println(Arrays.toString(copiedArray));
    }
}



