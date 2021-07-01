//Created by Sai Rohith
//Copyright © 2021 Sai Rohith. All rights reserved.
//Lab9Q4
import java.util.*;

class Str1
{
	int cmp(String s1, String s2)
	{
		return s1.compareTo(s2);
	}
	String swapcase(String s)
	{
		char[] arr = s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(arr[i]>=65 && arr[i]<=91)
				arr[i]+=32;
			if(arr[i]>=97 && arr[i]<=122)
				arr[i]-=32;
		}
		s = new String(arr);
		return s;
	}
	boolean sub(String s1, String s2)
	{
		return s1.contains(s2);
	}
	String subreplace(String s1, String s2)
	{
		if(s1.contains(s2))
			s1=s1.replaceAll(s2,"Hello");
		return s1;
	}
}

class menu
{
	public static void main(String[] args)
	{   
		System.out.println("Sai Rohith T - 190953059");
		Str1 str = new Str1();
		Scanner sc = new Scanner(System.in);
		int choice=0;
		System.out.println("Enter the main string");
		String s1 = sc.nextLine();
		System.out.println("Enter the sub string");
		String s2 = sc.nextLine();
		while(choice!=5)
		{
			System.out.println("1.Compare\n2.Convert\n3.Is sub or not\n4.Replace sub\n5.Exit");
			choice = sc.nextInt();
			if(choice==1)
				System.out.println(str.cmp(s1,s2));
			if(choice==2)
				System.out.println(str.swapcase(s1));
			if(choice==3)
				System.out.println(str.sub(s1,s2));
			if(choice==4)
				System.out.println(str.subreplace(s1,s2));
			System.out.println("\n");
		}
		sc.close();
	}
}