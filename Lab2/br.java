//Created by Sai Rohith
//Copyright © 2021 Sai Rohith. All rights reserved.
//Lab9Q1
import java.util.*;
class br
{
	public static void main(String[] args)
	{   
		System.out.println("Sai Rohith T - 190953059");
		Scanner sc = new Scanner(System.in);
		System.out.println("Input String: ");
		String s = sc.nextLine();
		int count_vowels=0, count_words=0, count_lines=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' 
			|| s.charAt(i)=='u'|| s.charAt(i)=='A'|| s.charAt(i)=='E'|| s.charAt(i)=='I'
			|| s.charAt(i)=='O'|| s.charAt(i)=='U')
				count_vowels++;
			if(s.charAt(i)==' ')
				count_words++;
			if(s.charAt(i)=='.')
				count_lines++;
		}
		count_words++;
		System.out.println("No. of characters = "+s.length());
		System.out.println("No. of vowels = "+count_vowels);
		System.out.println("No. of words = "+count_words);
		System.out.println("No. of lines = "+count_lines);
		sc.close();
	}
}