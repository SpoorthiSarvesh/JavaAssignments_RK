package com.oopsConcepts.Examples.pillars.inheritance.multilevel;

public class Parent {
    void parent(){
        System.out.println("This is parent class method");
    }
}
class Child extends Parent{
    void child(){
        System.out.println("This is child class method");
    }

}
class GrandChild extends Child{
    void grandchild(){
        System.out.println("This is grandChild method");
    }

    public static void main(String[] args) {
        System.out.println("-------------------------");
        Parent parent=new Parent();
        parent.parent();
        System.out.println("--------------------------");
        Child child=new Child();
        child.parent();
        child.child();
        System.out.println("--------------------------");
        GrandChild grandChild=new GrandChild();
        grandChild.parent();
        grandChild.child();
        grandChild.grandchild();
        System.out.println("--------------------------");
    }

}