package com.oopsConcepts.Examples.pillars.encapsulation;

public class EncapEmployee {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setEmpId(123);
        e1.setName("Spoorthi");
        e1.setEmail("spoo@123");
        System.out.println("ID is: "+e1.getEmpId());
        System.out.println("Name is: "+e1.getName());
        System.out.println("Email Id : "+e1.getEmail());

    }
}
