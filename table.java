//Created by Sai Rohith
//Copyright © 2021 Sai Rohith. All rights reserved.
/**L1.Q1.Write a Java program to print table of number entered by user .*/
//Multiplication Table
import java.util.*;
public class table{
public static void main(String[] args){
    int result;
    System.out.println("Sai Rohith T - 190953059");
    Scanner scanner = new Scanner(System.in);
    int input;
    //taking input from user
    System.out.println("Enter table");
    input = scanner.nextInt();
    //Simple for loop which runs from 1 to 10
    for(int i=1;i<11;i++){
    result = i*input;//Logic to compute the multiplication table
    System.out.println(input+"*"+i +"="+(result));//Displaying the result
}
}
}