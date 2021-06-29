//Created by Sai Rohith on 2021-06-28
//Copyright © 2021 Sai Rohith. All rights reserved.
//search
import java.util.*;
class search
{
	public static void main(String args[])
	{
		System.out.println("Sai Rohith T - 190953059");
		//Given Array a[]={1,2,3,1,2,1,5,6,7}
		int a[]={1,2,3,1,2,1,5,6,7};
		int i,key,flag=0;
		//Displaying the array
		for(i=0;i<9;i++)
			System.out.println(a[i]+"\t");
		//taking user input for the Key element to be searched for
		System.out.println("Enter the key to be searched in the above array: ");
		Scanner s=new Scanner(System.in);
		key=s.nextInt();
		System.out.print("Value is found at locations: ");
		for(i=0;i<9;i++)
			if(a[i]==key)
			{   //We set flag to 1, if we found the key at the position and print the index when flag = 1
				flag=1;
				System.out.print("a["+i+"]\t");
			}
		if(flag==0)
			System.out.print("None");//We set flag to 1 if we could'nt find the element and if the flag remains 
									//zero that means then number does'nt exist in the array
	}
}