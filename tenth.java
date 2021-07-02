//Created by Sai Rohith
//Copyright © 2021 Sai Rohith. All rights reserved.
//lab10Q10
import java.util.*;
class MyException extends Exception 
{   
    String s1;
    MyException(String s2)
    {
         s1=s2;
    }
    public String toString()
    { 
         return ("MyException Occurred: "+s1) ;
    }
}
public class tenth 
{
    public static void main(String args[]) 
    {   
    try
    {
        long num=0;
        System.out.println("Sai Rohith T - 190953059");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Password");
        num = s.nextInt();
            if(num==190953059)
            {
            System.out.println("Everything is okay");
            }
            else{
            throw new MyException("Wrong Password"); 
            }
        } 
        catch (MyException ex) 
        { 
            System.out.print("Caught: ");
            System.out.println(ex); 
        } 
    }
}