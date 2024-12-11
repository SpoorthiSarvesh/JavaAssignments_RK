//Write a Java program to create a class called "School"
//with attributes for students, teachers, and classes,
//and methods to add and remove students and teachers,
//and to create classes.

package com.objectsAndConstructorAssignment.set2;

import java.util.ArrayList;

class School {
    // Attributes
    private ArrayList<String> students;
    private ArrayList<String> teachers;
    private ArrayList<String> classes;

    // Constructor
    public School() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        classes = new ArrayList<>();
    }

    // Method to add a student
    public void addStudent(String studentName) {
        students.add(studentName);
        System.out.println("Student added: " + studentName);
    }

    // Method to remove a student
    public void removeStudent(String studentName) {
        if (students.remove(studentName)) {
            System.out.println("Student removed: " + studentName);
        } else {
            System.out.println("Student not found: " + studentName);
        }
    }

    // Method to add a teacher
    public void addTeacher(String teacherName) {
        teachers.add(teacherName);
        System.out.println("Teacher added: " + teacherName);
    }

    // Method to remove a teacher
    public void removeTeacher(String teacherName) {
        if (teachers.remove(teacherName)) {
            System.out.println("Teacher removed: " + teacherName);
        } else {
            System.out.println("Teacher not found: " + teacherName);
        }
    }

    // Method to create a class
    public void createClass(String className) {
        classes.add(className);
        System.out.println("Class created: " + className);
    }

    // Method to display all information
    public void displayInfo() {
        System.out.println("\nSchool Information:");
        System.out.println("Students: " + students);
        System.out.println("Teachers: " + teachers);
        System.out.println("Classes: " + classes);
    }
}

// Main class
public class SchoolMain {
    public static void main(String[] args) {
        School school = new School();

        // Adding students
        school.addStudent("Alice");
        school.addStudent("Bob");

        // Adding teachers
        school.addTeacher("Mr. Smith");
        school.addTeacher("Ms. Johnson");

        // Creating classes
        school.createClass("Math");
        school.createClass("Science");

        // Removing a student
        school.removeStudent("Bob");

        // Removing a teacher
        school.removeTeacher("Ms. Johnson");

        // Displaying information
        school.displayInfo();
    }
}

