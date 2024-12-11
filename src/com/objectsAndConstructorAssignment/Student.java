//10. Write a Java program to create a class called "Student"
//with a name, grade, and courses attributes, and methods to add and remove courses.

package com.objectsAndConstructorAssignment;

class Student {
    private String name;
    private String grade;
    private String[] courses;
    private int courseCount;

    // Constructor to initialize name, grade, and an empty array for courses
    public Student(String name, String grade, int maxCourses) {
        this.name = name;
        this.grade = grade;
        this.courses = new String[maxCourses]; // Array for storing courses
        this.courseCount = 0; // No courses initially
    }

    // Method to add a course to the student's course list
    public void addCourse(String course) {
        if (courseCount < courses.length) {
            // Check if course already exists
            for (int i = 0; i < courseCount; i++) {
                if (courses[i].equals(course)) {
                    System.out.println(course + " is already in the list.");
                    return;
                }
            }
            // Add the course to the array
            courses[courseCount++] = course;
            System.out.println(course + " added to " + name + "'s courses.");
        } else {
            System.out.println("Cannot add more courses. Maximum limit reached.");
        }
    }

    // Method to remove a course from the student's course list
    public void removeCourse(String course) {
        boolean found = false;
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].equals(course)) {
                // Shift remaining courses to the left
                for (int j = i; j < courseCount - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                courses[--courseCount] = null; // Nullify the last course after shifting
                System.out.println(course + " removed from " + name + "'s courses.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(course + " is not found in the course list.");
        }
    }

    // Method to display the student's details and courses
    public void displayStudentDetails() {
        System.out.println("Student: " + name);
        System.out.println("Grade: " + grade);
        System.out.print("Courses: ");
        if (courseCount == 0) {
            System.out.println("No courses enrolled.");
        } else {
            for (int i = 0; i < courseCount; i++) {
                System.out.print(courses[i] + " ");
            }
            System.out.println();
        }
    }
}

// Main class to test the Student functionality
class StudentMain {
    public static void main(String[] args) {
        // Create a Student object with a maximum of 3 courses
        Student student = new Student("Alice", "A", 3);

        // Display initial student details
        student.displayStudentDetails();

        // Add courses
        student.addCourse("Math");
        student.addCourse("Science");
        student.addCourse("History");

        // Display updated student details
        student.displayStudentDetails();

        // Try to add another course (exceeding the maximum limit)
        student.addCourse("Art");

        // Try removing a course
        student.removeCourse("Science");

        // Display updated student details after removing a course
        student.displayStudentDetails();

        // Try removing a non-existing course
        student.removeCourse("Art");
    }
}
