//Created by Sai Rohith on 2021-06-28
//Copyright © 2021 Sai Rohith. All rights reserved.
/**L1.Q1.Write a Java program to print table of number entered by user .*/
//Multiplication Table
package Lab1;
import java.util.*;
public class table{
public static void main(String[] args){
int result;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Sai Rohith T - 190953059");
    int input;
    System.out.println("Enter table");
    input = scanner.nextInt();
    for(int i=1;i<11;i++){
    result = i*input;
    System.out.println(input+"*"+i +"="+(result));
}
}
}