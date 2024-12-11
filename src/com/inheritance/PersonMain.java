//7. Write a Java program to create a class known as Person with methods called
//        getFirstName() and getLastName(). Create a subclass called Employee
//that adds a new method named getEmployeeId() and overrides the getLastName() method
//to include the employee's job title.
package com.inheritance;

// Parent class
class Person {
    private String firstName;
    private String lastName;

    // Constructor to initialize first and last name
    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Method to get the first name
    String getFirstName() {
        return firstName;
    }

    // Method to get the last name
    String getLastName() {
        return lastName;
    }
}

// Subclass Employee that extends Person
class Employee1 extends Person {
    private String jobTitle;
    private int employeeId;

    // Constructor to initialize all properties
    Employee1(String firstName, String lastName, String jobTitle, int employeeId) {
        super(firstName, lastName);
        this.jobTitle = jobTitle;
        this.employeeId = employeeId;
    }

    // Overriding the getLastName method to include the job title
    @Override
    String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")";
    }

    // Method to get the employee ID
    int getEmployeeId() {
        return employeeId;
    }
}

public class PersonMain {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee1 employee = new Employee1("John", "Doe", "Software Engineer", 12345);

        // Displaying details
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name: " + employee.getLastName()); // Includes job title
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}

