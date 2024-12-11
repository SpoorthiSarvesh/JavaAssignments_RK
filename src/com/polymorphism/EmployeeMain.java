//4. Write a Java program to create a class Employee with a method called
//        calculateSalary(). Create two subclasses Manager and Programmer.
//In each subclass, override the calculateSalary() method to
//calculate and return the salary based on their specific roles.
package com.polymorphism;

// Base class Employee
abstract class Employee {
    // Abstract method to calculate salary, to be implemented by subclasses
    public abstract double calculateSalary();
}

// Subclass Manager extending Employee
class Manager extends Employee {
    private double baseSalary;
    private double bonus;

    // Constructor to initialize base salary and bonus
    public Manager(double baseSalary, double bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    // Overriding the calculateSalary method for Manager
    @Override
    public double calculateSalary() {
        return baseSalary + bonus;  // Manager's salary = base salary + bonus
    }
}

// Subclass Programmer extending Employee
class Programmer extends Employee {
    private double baseSalary;
    private double overtimePay;

    // Constructor to initialize base salary and overtime pay
    public Programmer(double baseSalary, double overtimePay) {
        this.baseSalary = baseSalary;
        this.overtimePay = overtimePay;
    }

    // Overriding the calculateSalary method for Programmer
    @Override
    public double calculateSalary() {
        return baseSalary + overtimePay;  // Programmer's salary = base salary + overtime pay
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        // Creating objects of Manager and Programmer
        Employee manager = new Manager(50000, 10000);   // Manager with base salary 50000 and bonus 10000
        Employee programmer = new Programmer(40000, 5000); // Programmer with base salary 40000 and overtime pay 5000

        // Calculating and printing the salary of each employee
        System.out.println("Manager's Salary: " + manager.calculateSalary());
        System.out.println("Programmer's Salary: " + programmer.calculateSalary());
    }
}

