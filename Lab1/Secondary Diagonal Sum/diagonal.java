package Lab1;
import java.util.*;
class diagonal
{
	public static void main(String args[])
	{
System.out.println("Sai Rohith T - 190953059");
		int a[][]=new int[100][100];
		int i,j,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dimension of the square matrix: ");
		n=sc.nextInt();
		System.out.println("Enter the elements: ");
		for(i=0;i<n;i++)
		for(j=0;j<n;j++)
			a[i][j]=sc.nextInt();
		System.out.println("The non principal diagonal elements are: \n");
		for(i=0;i<n;i++)
		for(j=n-1;j>=0;j--)
		if(i+j==n-1)
		{
			System.out.print(a[i][j]+"\t");
			sum=sum+a[i][j];
			break;
		}
		System.out.println("\nSum of all non principal diagonal elements is "+sum);
	}
}