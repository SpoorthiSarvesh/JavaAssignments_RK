package com.oopsConcepts.Examples.pillars.abstraction.abstractClassesAndMethods;

abstract class Animals {
    //Two types of methods
    // 1. Abstract Method
    abstract void speed(); //It should be empty,Implementation has to be done in child classes
    // 2. Normal(Concrete Method)
    void eat(){
        System.out.println("Animals eat some food");
    }

}
class Panda extends Animals {

    @Override
    void speed() {
        System.out.println("pandas are very slow moving animals");
    }
}

class Tiger extends Animals{
    @Override
    void speed() {
        System.out.println("Tigers are fast moving animals");
    }
}

class Abstraction{
    public static void main(String[] args) {
        Panda panda=new Panda();
        Tiger tiger=new Tiger();
        panda.eat();
        panda.speed();
        System.out.println("------------------------------");
        tiger.eat();
        tiger.speed();
    }
}
