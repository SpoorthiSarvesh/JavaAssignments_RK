package com.oopsConcepts.Examples.pillars.inheritance.single;

public class Animal {      //parent
    void eat() {
        System.out.println("Animals eat some kind of food");
    }

    void walk() {
        System.out.println("Most animals walk on 4 legs");
    }
    static void display(){
        System.out.println("This is animal class");
    }
}
    class Dog extends Animal {//children
    void run(){
        System.out.println("dogs run fast");
    }
//    void method(){
//        super.eat(); //usage of super keyword, child class method inherits parent class method
//        super.walk();
//    }
        public static void main(String[] args) {
            Dog dog = new Dog();
            dog.run();
            dog.eat();
            dog.walk();
              display(); // because it is static method
        }
    }
