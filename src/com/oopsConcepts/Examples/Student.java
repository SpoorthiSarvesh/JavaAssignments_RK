package com.oopsConcepts.Examples;

public class Student {
    //attributes,properties
    int age;
    String name;
    String emailID;
    public void details() //method
    {
        System.out.println("Age is: "+age);
        System.out.println("Name is:  "+name);
        System.out.println("email ID is: "+emailID);

    }

    public static void main(String[] args) {
        Student s1=new Student(); //reference,object creation,instance,variable
        s1.age=28;
        s1.name="Saurav";
        s1.emailID="CodersArcade@567";
        s1.details();
        Student s2=new Student();
        s2.age=30;
        s2.name="Ashank";
        s2.emailID="ashank@345";
        s2.details();

    }
}
