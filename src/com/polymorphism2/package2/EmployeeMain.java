//4. Write a Java program to create a class Employee with a method called
//        calculateSalary(). Create two subclasses Manager and Programmer.
//In each subclass, override the calculateSalary() method to
//calculate and return the salary based on their specific roles.
package com.polymorphism2.package2;


abstract class Employee {

    public abstract double calculateSalary();
}


class Manager extends Employee {
    private double baseSalary;
    private double bonus;


    public Manager(double baseSalary, double bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;  // Manager's salary = base salary + bonus
    }
}


class Programmer extends Employee {
    private double baseSalary;
    private double overtimePay;


    public Programmer(double baseSalary, double overtimePay) {
        this.baseSalary = baseSalary;
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + overtimePay;
    }
}

public class EmployeeMain {
    public static void main(String[] args) {

        Employee manager = new Manager(50000, 10000);
        Employee programmer = new Programmer(40000, 5000);

        // Calculating and printing the salary of each employee
        System.out.println("Manager's Salary: " + manager.calculateSalary());
        System.out.println("Programmer's Salary: " + programmer.calculateSalary());
    }
}

