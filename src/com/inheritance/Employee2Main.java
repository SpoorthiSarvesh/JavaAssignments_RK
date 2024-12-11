//10. Write a Java program that creates a class hierarchy for employees of a company.
//The base class should be Employee, with subclasses Manager, Developer, and Programmer.
//Each subclass should have properties such as name, address, salary, and job title.
//Implement methods for calculating bonuses, generating performance reports, and managing projects.
package com.inheritance;

// Base class
class Employee2 {
    String name;
    String address;
    double salary;
    String jobTitle;

    // Constructor to initialize employee properties
    Employee2(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    // Method to calculate a generic bonus (can be overridden)
    double calculateBonus() {
        return salary * 0.10; // Default 10% bonus
    }

    // Method to generate a performance report
    void generatePerformanceReport() {
        System.out.println("Performance Report for: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Address: " + address);
        System.out.println("Salary: $" + salary);
    }

    // Method to manage projects (general message, overridden in subclasses)
    void manageProjects() {
        System.out.println(name + " is managing a generic project.");
    }
}

// Subclass Manager
class Manager extends Employee2 {
    Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    double calculateBonus() {
        return salary * 0.20; // Managers get a 20% bonus
    }

    @Override
    void manageProjects() {
        System.out.println(name + " is overseeing multiple projects and ensuring deadlines are met.");
    }
}

// Subclass Developer
class Developer extends Employee2 {
    Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    @Override
    double calculateBonus() {
        return salary * 0.15; // Developers get a 15% bonus
    }

    @Override
    void manageProjects() {
        System.out.println(name + " is developing and implementing features for assigned projects.");
    }
}

// Subclass Programmer
class Programmer extends Employee2 {
    Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    @Override
    double calculateBonus() {
        return salary * 0.12; // Programmers get a 12% bonus
    }

    @Override
    void manageProjects() {
        System.out.println(name + " is writing, testing, and debugging code for various projects.");
    }
}

// Main class
public class Employee2Main {
    public static void main(String[] args) {
        // Creating objects for each type of employee
        Manager manager = new Manager("Alice", "123 Manager St", 80000);
        Developer developer = new Developer("Bob", "456 Developer Ave", 70000);
        Programmer programmer = new Programmer("Charlie", "789 Programmer Ln", 60000);

        // Display details and specific methods for Manager
        System.out.println("=== Manager Details ===");
        manager.generatePerformanceReport();
        System.out.println("Bonus: $" + manager.calculateBonus());
        manager.manageProjects();

        System.out.println("\n=== Developer Details ===");
        developer.generatePerformanceReport();
        System.out.println("Bonus: $" + developer.calculateBonus());
        developer.manageProjects();

        System.out.println("\n=== Programmer Details ===");
        programmer.generatePerformanceReport();
        System.out.println("Bonus: $" + programmer.calculateBonus());
        programmer.manageProjects();
    }
}

