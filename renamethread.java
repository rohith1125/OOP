public class renamethread 
{
    public static void main(String[] args) 
    {
        t t1 = new t();
        System.out.println("Thread name: " + t1.getName() + "\tPriority: "+t1.getPriority() +"\tID: "+ t1.getId());
        t1.start();
        		try
				{
					t1.sleep(400);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
        t1.setName("Rohith");
        System.out.println("Thread Renamed");
        System.out.println("Thread name: " + t1.getName() + "\tPriority: "+t1.getPriority() +"\tID: "+ t1.getId());
        
    }
}

class t extends Thread
{
    public void run()
    {
    System.out.println("Thread started");
    }
}
