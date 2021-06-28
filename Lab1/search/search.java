//Created by Sai Rohith on 2021-06-28
//Copyright © 2021 Sai Rohith. All rights reserved.
//calc
package Lab1.search;
import java.util.*;
class search
{
	public static void main(String args[])
	{
		System.out.println("Sai Rohith T - 190953059");
		int a[];
		a = new int[100]; 
		int i,key,flag=0,n;
		System.out.println("Enter number of elements in the array");
		Scanner s1 = new Scanner(System.in); 
		n = s1.nextInt(); 
		System.out.println("Enter elements");
		for(int k = 0; k < n; k++)
		{
			Scanner s2 = new Scanner(System.in); 
			a[k] = s2.nextInt();
		}
		System.out.println("Enter the key to be searched for ");
		Scanner s=new Scanner(System.in);
		key=s.nextInt();
		System.out.print("Value is found at locations: ");
		for(i=0;i<n;i++)
			if(a[i]==key)
			{
				flag=1;
				System.out.print("a["+i+"]\t");
			}
		if(flag==0)
			System.out.print("Key Not Found");
	}
}