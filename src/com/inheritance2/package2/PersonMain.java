//7. Write a Java program to create a class known as Person with methods called
//        getFirstName() and getLastName(). Create a subclass called Employee
//that adds a new method named getEmployeeId() and overrides the getLastName() method
//to include the employee's job title.
package com.inheritance2.package2;


class Person {
    private String firstName;
    private String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }


    String getLastName() {
        return lastName;
    }
}

class Employee1 extends Person {
    private String jobTitle;
    private int employeeId;


    Employee1(String firstName, String lastName, String jobTitle, int employeeId) {
        super(firstName, lastName);
        this.jobTitle = jobTitle;
        this.employeeId = employeeId;
    }

    @Override
    String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")";
    }


    int getEmployeeId() {
        return employeeId;
    }
}

public class PersonMain {
    public static void main(String[] args) {

        Employee1 employee = new Employee1("John", "Doe", "Software Engineer", 12345);


        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name: " + employee.getLastName()); // Includes job title
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}

