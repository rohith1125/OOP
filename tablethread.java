class tablethread 
{
	public static void main(String args[])
	{
		Table obj = new Table();
		Mythread1 th1 = new Mythread1(obj);
		Mythread2 th2 = new Mythread2(obj);
		Mythread3 th3 = new Mythread3(obj);
		th1.start();
		th2.start();
		th3.start();
	}
}
class Table
{
	void printTable(int n)
	{       
	   /* synchronized(this)
	    {*/
			for(int i=1;i<=10;i++)
			{
				System.out.println(+n+"*"+i+"="+(n*i));
			/*	try
				{
					Thread.sleep(400);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}*/
			}
	    //}
	}
}

class Mythread1 extends Thread
{
	Table t;
	Mythread1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}


class Mythread2 extends Thread
{
	Table t;
	Mythread2(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(7);
	}
}

class Mythread3 extends Thread
{
	Table t;
	Mythread3(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(13);
	}
}