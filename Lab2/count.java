//Created by Sai Rohith
//Copyright © 2021 Sai Rohith. All rights reserved.
//Lab7Q2
import java.util.*;
public class count 
{
    public static void main(String args[])
    {
        System.out.println("Sai Rohith T - 190953059");
        Counter c[] = new Counter[100];//Array of objects to count the objects
        int x = 0;
        String s;
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to create new object y/n");
        s = scan.nextLine();
        //Running a while loop, to create multiple objects
        while (s.equals("y"))
        {
            System.out.println((x+1)+"  Object(s) created");
            System.out.println("Do you want to create new object y/n");
            s = scan.nextLine();
            c[x] = new Counter();
            x++;
        }
        System.out.println("No. of objects:" + Counter.count);
        scan.close();//Preventing Resource leak by closing the object of scanner class
    }

}
class Counter 
{
    static int count = 0;
    Counter() 
    {
        count += 1;
    }
}

