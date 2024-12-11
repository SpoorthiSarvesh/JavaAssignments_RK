//4. Write a Java program to create a class called Employee
//        with methods called work() and getSalary(). Create a subclass called HRManager
//that overrides the work() method and adds a new method called addEmployee().
package com.inheritance2.package2;


class Employee {

    void work() {
        System.out.println("Employee is working");
    }


    double getSalary() {
        return 50000;
    }
}


class HRManager extends Employee {

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

        HRManager hrManager = new HRManager();


        hrManager.work();


        hrManager.addEmployee("John Doe");


        System.out.println("HR Manager's salary: " + hrManager.getSalary());
    }
}

