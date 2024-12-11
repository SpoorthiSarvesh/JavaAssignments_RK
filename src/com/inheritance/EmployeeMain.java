//4. Write a Java program to create a class called Employee
//        with methods called work() and getSalary(). Create a subclass called HRManager
//that overrides the work() method and adds a new method called addEmployee().
package com.inheritance;

// Parent class
class Employee {
    // Method to work
    void work() {
        System.out.println("Employee is working");
    }

    // Method to get salary
    double getSalary() {
        return 50000; // Default salary
    }
}

// Subclass HRManager that overrides work method and adds addEmployee method
class HRManager extends Employee {
    // Overriding the work method
    @Override
    void work() {
        System.out.println("HR Manager is managing human resources");
    }

    // New method to add an employee
    void addEmployee(String employeeName) {
        System.out.println("Adding new employee: " + employeeName);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        // Creating an object of HRManager
        HRManager hrManager = new HRManager();

        // Calling overridden method
        hrManager.work();

        // Calling the new method
        hrManager.addEmployee("John Doe");

        // Calling the getSalary method
        System.out.println("HR Manager's salary: " + hrManager.getSalary());
    }
}

