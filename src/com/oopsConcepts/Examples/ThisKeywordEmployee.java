package com.oopsConcepts.Examples;

public class ThisKeywordEmployee {
    int empId;
    String name;//attributes
    String email;
    static  final String company="coders arcade";

    public ThisKeywordEmployee(String name, String email, int empId) {
        this.name = name;
        this.email = email;
        this.empId = empId;
    }
    public void EmployeeDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Email: "+this.email);
        System.out.println("EmpID: "+this.empId);
        System.out.println("Company: "+company);

}


    public static void main(String[] args) {
        ThisKeywordEmployee e1=new ThisKeywordEmployee("Saurav","codersarcade@346",89);
        e1.EmployeeDetails();
        ThisKeywordEmployee e2=new ThisKeywordEmployee("Ashank","Ashank@123",78);
        e2.EmployeeDetails();
    }
}
