package com.oopsConcepts.Examples;

public class Constructor {
    int x;//attributes
    int y;
    int z;
    public Constructor(){ //no argument constructor(default constructor)

    }
    public Constructor(int a,int b){
        x=a;
        y=b;
    }
    public Constructor(int a,float b){//changing datatype
        x=a;
        y= (int) b;

    }

    public Constructor(int a,float b,double c){//changing datatype
        x=a;
        y= (int) b;
        z= (int) c;
    }

    public static void main(String[] args) {
        Constructor c1=new Constructor();
        System.out.println("x value is: "+c1.x+" y value is: "+c1.y);
        Constructor c2=new Constructor(2,4);
        System.out.println("x value is: "+c2.x+" y value is: "+c2.y);
        Constructor c3=new Constructor(3,6.7f);
        System.out.println("x value is: "+c3.x+" y value is: "+c3.y);
        Constructor c4=new Constructor(2,6.5f,8.9f);
        System.out.println("x value is: "+c4.x+" y value is: "+c4.y+" z value is: "+c4.z);


    }

}
