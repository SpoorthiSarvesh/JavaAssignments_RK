//7. Write a Java program to take the user for a distance (in meters) and the time taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).
//Test Data
//Input distance in meters: 2500
//Input hour: 5
//Input minutes: 56
//Input seconds: 23
//Expected Output :
//Your speed in meters/second is 0.11691531
//Your speed in km/h is 0.42089513
//Your speed in miles/h is 0.26158804
package com.assignment1;

import java.util.Scanner;

public class DistanceSpeedKilometers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input distance in meters:");
        int distance=sc.nextInt();
        System.out.println("Input hour:");
        int hour=sc.nextInt();
        System.out.println("Input minutes:");
        int minutes=sc.nextInt();
        System.out.println("Input seconds: ");
        int seconds= sc.nextInt();
        float speedInMeterPerSec= (float) distance /((hour*3600)+(minutes*60)+seconds);
        System.out.println("Your speed in meters/second is "+speedInMeterPerSec);
        double speedInKmPerHour=speedInMeterPerSec*3.6;
        System.out.println("Your speed in km/h is "+speedInKmPerHour);
        double speedInMilesPerHour=speedInKmPerHour*0.621371;
        System.out.println("Your speed in miles/h is "+ speedInMilesPerHour);

    }
}
