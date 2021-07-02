//Created by Sai Rohith
//Copyright © 2021 Sai Rohith. All rights reserved.
//Lab7Q1
import java.util.*;
public class student_details 
{
    Scanner sc=new Scanner(System.in);
    static String clg="MIT";
    String name;
    int id;
    
    public void info()    //Method to take student details
    {
    System.out.println("Enter student name");
    name=sc.nextLine();
    System.out.println("Enter student id");
    id=sc.nextInt();
    }
    
    public void display(student_details obj)    //Method to display student details
    {
    System.out.println("Name is : "+obj.name+"\nId is : "+obj.id+"\ncollege name : "+clg);
    }
    public static void main(String[] args) 
    {   
        System.out.println("Sai Rohith T - 190953059");
        Scanner sc1=new Scanner(System.in);
        //Taking number of entries
        System.out.println("enter number of students");
        int n=sc1.nextInt();
        //Creating array of Object to store the details od students
        student_details obj1[]=new student_details[n];
        for(int i=0;i<n;i++)
        {
            obj1[i]=new student_details();
            obj1[i].info();
            obj1[i].display(obj1[i]);
        }
        sc1.close();//Preventing Resource leak by closing the object of scanner class
    }
}