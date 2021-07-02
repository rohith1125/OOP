//Created by Sai Rohith
//Copyright © 2021 Sai Rohith. All rights reserved.
//Lab8Q2
public class geometry{
    public static void main(String args[]){
        System.out.println("Sai Rohith T - 190953059");
        Rectangle r= new Rectangle(60,40);
        r.display();  //Displaying r value
        Circle c=new Circle(10);
        c.display(); //Displaying c value
    }
}
abstract class Compute{
    double a;
    abstract void area();
    void display(){
        area();
        System.out.println(a);
    }
}

class Rectangle extends Compute{
    double length;
    double breath;
    Rectangle(double l,double w)//Constructor of class Rectangle
    {
        length=l;
        breath=w;
    }
    void area()// abstract method from abstract parent class Compute
    {
        a = length*breath;
    }
}

class Circle extends Compute{
    double radius;
    Circle(double r)//Constructor of class Circle
    {
        radius=r;
    }
    void area()// abstract method from abstract parent class Compute
    {
        a= (Math.PI)*radius*radius;
    }
}
