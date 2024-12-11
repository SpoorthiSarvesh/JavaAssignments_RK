//Write a Java program to create a class called "Employee" with a name, job title, and salary attributes,
//and methods to calculate and update salary.
package com.objectsAndConstructorAssignment;

public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to update salary
    public void updateSalary(double percentage) {
        salary += salary * (percentage / 100);
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Monthly Salary: $" + salary);
        System.out.println("Annual Salary: $" + (salary * 12));
    }
}
class EmployeeMain {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("Alice", "Developer", 4000);

        // Display initial details
        System.out.println("Initial Employee Details:");
        emp.displayDetails();

        // Update salary by 20%
        emp.updateSalary(20);
        System.out.println("\nAfter Salary Update:");
        emp.displayDetails();
    }
}
