//Created by Sai Rohith
//Copyright © 2021 Sai Rohith. All rights reserved.
//Armstrong
package Lab1.Armstrong;
import java.util.*;
class armstrong
{
	public static void main(String args[])
	{   
	    System.out.println("Sai Rohith T - 190953059");
		int arr[]=new int[10];
		int n,a,i,order,arm;
		i=0;arm=0;
		//User input
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=s.nextInt();
		a=n;
		//Armstrong Number Logic
		while(a>0)
		{
			arr[i]=a%10;
			a=a/10;
			i++;
		}
		order=i;
		for(i=0;i<order;i++)
			arm=arm+(int)(Math.pow(arr[i],order));
		if (arm==n)
			System.out.println("armstrong number");
		else
			System.out.println("not an armstrong number");
	}
}