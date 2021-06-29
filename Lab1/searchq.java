//Created by Sai Rohith
//Copyright © 2021 Sai Rohith. All rights reserved.
//search
import java.util.*;
import java.util.Scanner;
public class searchq{
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        System.out.println("Sai Rohith T 190953059");
        //Given Array a[]={1,2,3,1,2,1,5,6,7}
        int arr[]={1,2,3,1,2,1,5,6,7};
        int key;
        int flag=0;
        //Displaying the array
        System.out.println("the elements are");
        //taking user input for the Key element to be searched for
        for(int i=0;i<9;i++)
			System.out.println(arr[i]+"\t");
        System.out.println("Enter the key:");
        key=scan.nextInt();
        System.out.print("The output is found at location:");
        int c=0;
        for(int i:arr){
            if(i==key){
                //We set flag to 1, if we found the key at the position and print the index when flag = 1
                flag=1;
                System.out.print("a["+c+"] ");
            }
            c++;
        }
		if(flag==0)
		System.out.print("None");//We set flag to 1 if we could'nt find the element and if the flag remains 
								//zero that means then number does'nt exist in the array
    }
}
