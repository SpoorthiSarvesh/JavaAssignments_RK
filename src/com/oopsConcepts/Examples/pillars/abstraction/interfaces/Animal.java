package com.oopsConcepts.Examples.pillars.abstraction.interfaces;

public interface Animal { //we are not creating Class,we are creating interface
    void eat();   //methods having empty body, implementations of these methods is given in the classes which will implements this class
    void speed();    //

}
class Cheetah implements Animal{

    @Override
    public void eat() {
        System.out.println("Cheetah is an carnivore animal");  // implementation of the methods in done in this class
    }

    @Override
    public void speed() {
        System.out.println("Cheetah is very fastest animal");
    }
}

class Sloth implements Animal{

    @Override
    public void eat() {
        System.out.println("Sloth is Herbivores");              // implementation of the methods in done in this class
    }

    @Override
    public void speed() {
        System.out.println("Sloth is the slowest animal");
    }
}

class InterfaceDemo{
    public static void main(String[] args) {
        Cheetah cheetah=new Cheetah();
        cheetah.eat();
        cheetah.speed();
        System.out.println("--------------------------");
        Sloth sloth=new Sloth();
        sloth.eat();
        sloth.speed();
    }
}