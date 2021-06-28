package Lab1.Armstrong;
import java.util.*;
class armstrong
{
	public static void main(String args[])
	{
		int arr[]=new int[10];
		int n,a,i,order,arm;
		i=0;arm=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=s.nextInt();
		a=n;
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