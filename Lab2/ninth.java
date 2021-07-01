//Created by Sai Rohith
//Copyright © 2021 Sai Rohith. All rights reserved.
//Lab10Q9
import java.util.Scanner;
class Student{
 String name;
 int roll;
 int marks1;
 int marks2;
 int marks3;
 double percent;
 char grade;
 
 Student(String name,String Roll,String Marks1,String Marks2, String Marks3){
 this.name=name;
 roll=Integer.parseInt(Roll);
 marks1=Integer.parseInt(Marks1);
 marks2=Integer.parseInt(Marks2);
 marks3=Integer.parseInt(Marks3);
}//assigning marks
 void calculate(){
 percent = (marks1+marks2+marks3)/3;
 grade=percent>80?'A':percent>70?'B':percent>60?'C':percent>50?'D':percent
>40?'E':'F';
 }//calculating percentage
 void display(){
 System.out.println(name+" "+roll+" "+percent+" "+grade+" ");
 }//displays output
}
public class ninth {
 public static void main(String[] args) {
 // TO DO code application logic here
System.out.println("Sai Rohith T - 190953059");
 Scanner sc=new Scanner(System.in);
 String name,roll,marks1,marks2,marks3;
 
 System.out.println("Enter the student name:");
 name=sc.next();
 System.out.println("Enter students roll number:");
 roll=sc.next();
 System.out.println("Enter Students marks sub1:");
 marks1=sc.next();
 System.out.println("Enter Students marks sub2:");
 marks2=sc.next();
 System.out.println("Enter Students marks sub3:");
 marks3=sc.next();//prints Students marks in three subjects
 try{
 Student student= new Student(name,roll,marks1,marks2,marks3);
 student.calculate();
 student.display();
 }
 catch(NumberFormatException e){
 System.out.println(e);
 }
 }
}