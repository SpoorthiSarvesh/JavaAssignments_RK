//1. Write a Java program to create a class called "Person" with a name and age attribute.
//Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.
package com.objectsAndConstructorAssignment;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

  public void printDetails(){
      System.out.println("Name: "+ this.name);
      System.out.println("age: "+this.age);
  }

    public static void main(String[] args) {
        Person p1=new Person("spoo",31);
        p1.printDetails();
        Person p2=new Person("Nidhi",6);
        p2.printDetails();

    }
}
