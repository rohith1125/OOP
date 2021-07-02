// Java program to demonstrat ethat a child thread
// gets same priority as parent
import java.lang.*;

class Th extends Thread {
	public void run()
	{
		System.out.println("Inside run method");
	}

	public static void main(String[] args)
	{
		Th t1 = new Th();
		Th t2 = new Th();
		Th t3 = new Th();
		// t1 thread is child of main thread
		// so t1 thread will also have priority 6.
		System.out.println("Before Setting Priority");
		System.out.println("t1 thread priority : "+ t1.getPriority());
		System.out.println("t2 thread priority : "+ t2.getPriority());
		System.out.println("t3 thread priority : "+ t3.getPriority());
        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);
        System.out.println("After Setting Priority");
        System.out.println("t1 thread priority : "+ t1.getPriority());
		System.out.println("t2 thread priority : "+ t2.getPriority());
		System.out.println("t3 thread priority : "+ t3.getPriority());
	}
}
