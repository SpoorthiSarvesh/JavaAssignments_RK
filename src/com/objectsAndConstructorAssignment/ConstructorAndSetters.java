//2. Write a Java program to create a class called "Dog" with a name and breed attribute.
//Create two instances of the "Dog" class,
//set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.
package com.objectsAndConstructorAssignment;

class Dog{
   private String name;
    private String breed;

    public String getName() {  //getters and Setters
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Dog(String name, String breed) {   //Constructor
        this.name = name;
        this.breed = breed;
    }

   public void DogDetails(){
       System.out.println("Dog name: "+ this.name);
       System.out.println("Dog Breed: "+this.breed);
   }
    public static void main(String[] args) {
        Dog d1=new Dog("sony","breed1");
        System.out.println("Initial Details");
        System.out.println("____________________________________");
        d1.DogDetails();
        System.out.println("Updated Details");
        System.out.println("____________________________________");
        d1.setName("Sweety");
        d1.setBreed("Husky");
        d1.DogDetails();
        Dog d2=new Dog("boxy","breed2");
        System.out.println("Initial Details");
        System.out.println("____________________________________");
        d2.DogDetails();
        d2.setName("Hearty");
        d2.setBreed("Pomorian");
        System.out.println("Updated Details");
        System.out.println("____________________________________");
        d2.DogDetails();

    }
}
