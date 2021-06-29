//Created by Sai Rohith on 2021-06-28
//Copyright © 2021 Sai Rohith. All rights reserved.
//Secondary Diagonal Sum
package Lab1.Secondary_Diagonal_Sum;
import java.util.*;
class diagonal
{
	public static void main(String args[])
	{
		System.out.println("Sai Rohith T - 190953059");
		int a[][]=new int[100][100];
		int i,j,n,sum=0;
		Scanner sc=new Scanner(System.in);
		//Taking user input
		System.out.println("Enter the dimension of the square matrix: ");
		n=sc.nextInt();
		System.out.println("Enter the elements: ");
		for(i=0;i<n;i++)
		for(j=0;j<n;j++)
			a[i][j]=sc.nextInt();
		System.out.println("The non principal diagonal elements are: \n");
		//Computing the sum of secondary diagonal
		for(i=0;i<n;i++)
		for(j=n-1;j>=0;j--)
		if(i+j==n-1)
		{
			//Logic for secondary diagonal addition
			System.out.print(a[i][j]+"\t");
			sum=sum+a[i][j];
			break;
		}
		System.out.println("\nSum of all non principal diagonal elements is "+sum);
	}
}