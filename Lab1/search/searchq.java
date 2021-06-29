//Created by Sai Rohith on 2021-06-28
//Copyright © 2021 Sai Rohith. All rights reserved.
//search
import java.util.*;
class search
{
	public static void main(String args[])
	{
System.out.println("Sai Rohith T - 190953059");
		int a[]={1,2,3,1,2,1,5,6,7};
		int i,key,flag=0;
		for(i=0;i<9;i++)
			System.out.println(a[i]+"\t");
		System.out.println("Enter the key to be searched in the above array: ");
		Scanner s=new Scanner(System.in);
		key=s.nextInt();
		System.out.print("Value is found at locations: ");
		for(i=0;i<9;i++)
			if(a[i]==key)
			{
				flag=1;
				System.out.print("a["+i+"]\t");
			}
		if(flag==0)
			System.out.print("None");
	}
}