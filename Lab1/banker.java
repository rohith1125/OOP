//Created by Sai Rohith
//Copyright © 2021 Sai Rohith. All rights reserved.
//calculator
import java.util.*;
class account
{
	protected String name;
	protected long acc_no;
	protected char type;
	account()
	{
		name="";
		acc_no=0;
		type='\0';
	}
	account(String n,long a,char t)
	{
		name=n;
		acc_no=a;
		type=t;
	}
}
class savings extends account
{
	double bal, irst;	
	savings()
	{
		bal=0;
		irst=0;
	}
	savings(double b,double i)
	{
		bal=b;
		irst=i;
	}
	void dep(double d)
	{
		bal=bal+d;
	}
	void wdraw(double w)
	{
		if(bal>w)
		{
			bal=bal-w;
		}
		else
		System.out.println("Insufficient balance");
	}
	void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Account number : "+acc_no);
		System.out.println("Current Balance : Rs. "+bal);
	}
	void interest()
	{
			double i=irst*bal/100.0;
			System.out.println("Interest earned : Rs."+i);
			bal=bal+i;
			display();
	}
}
class current extends account
{
	double bal, stax, mbal;	
	current()
	{
		bal=0;
		stax=0;
		mbal=0;
	}
	current(double b,double s,double m)
	{
		bal=b;
		stax=s;
		mbal=m;
	}
	void dep(double d)
	{
		bal=bal+d;
	}
	void wdraw(double w)
	{
		if(bal>w)
		{
			bal=bal-w;
		}
		else
		System.out.println("Insufficient balance");
	}
	void display()
	{
		
		System.out.println("Name : "+name);
		System.out.println("Account number : "+acc_no);
		System.out.println("Current Balance : Rs. "+bal);
	}
	void check()
	{
		if(bal<mbal)
		{
			System.out.println("Balance below minimum balance");
			double f=stax*mbal/100.0;
			System.out.println("Service tax imposed :"+f);
			bal=bal-f;
		}
	}
}
class banker
{
	public static void main(String[] args)
	{
		double b,m,s,d,w;
		char c;
		String n;
		int ch;
		System.out.println("Sai Rohith T 190953059");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		n=sc.nextLine();
		System.out.println("Enter account number");
		long a=sc.nextLong();

		do
		{
			System.out.println("Enter account type. Enter c for current or s for savings or e to exit. Enter your choice.");
			c=sc.next().charAt(0);


			account Sob=new account(n,a,c);
			switch(c)
			{
				case 'c':
				System.out.println("Enter balance");
				b=sc.nextDouble();
				System.out.println("Enter minimum balance");
				m=sc.nextDouble();
				System.out.println("Enter service tax");
				s=sc.nextDouble();
				if(b<m)
					b=b*s/100;
				current ob1=new current(b,s,m);
				ob1.name=Sob.name;
				ob1.acc_no=Sob.acc_no;
				
				do
				{
					System.out.println("Enter 1 to deposit, 2 to withdraw, 3 to check balance, 4 to exit.");
					System.out.println("Enter your choice");
					ch=sc.nextInt();
					switch(ch)
					{
						case 1:
						System.out.println("Enter amount to be deposited");
						d=sc.nextDouble();
						ob1.dep(d);
						ob1.check();
						break;
						case 2:
						System.out.println("Enter amount to be withdrawn");
						w=sc.nextDouble();
						ob1.wdraw(w);
						ob1.check();
						break;
						case 3:
						ob1.display();
						break;
						case 4:
						break;
						default:
						System.out.println("Invalid choice");
					}
				}while(ch!=4);
				break;
				case 's':
				System.out.println("Enter balance");
				b=sc.nextDouble();
				System.out.println("Enter interest rate");
				double i=sc.nextDouble();
				savings ob2=new savings(b,i);
				ob2.name=Sob.name;
				ob2.acc_no=Sob.acc_no;
				do
				{
					System.out.println("Enter 1 to deposit, 2 to withdraw, 3 to check balance, 4 to add interest, 5 to exit.");
					System.out.println("Enter your choice");
					ch=sc.nextInt();
					switch(ch)
					{
						case 1:
						System.out.println("Enter amount to be deposited");
						d=sc.nextDouble();
						ob2.dep(d);
						break;
						case 2:
						System.out.println("Enter amount to be withdrawn");
						w=sc.nextDouble();
						ob2.wdraw(w);
						break;
						case 3:
						ob2.display();
						break;
						case 4:
						ob2.interest();
						break;
						case 5:
						break;
						default:
						System.out.println("Invalid choice");
					}
				}while(ch!=5);
				break;
				case 'e':
				break;
				default:
				System.out.println("Invalid choice");
			}
		}while(c!='e');
	}
}