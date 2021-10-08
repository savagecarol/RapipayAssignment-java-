package ThreadConcept;




class ThreadX implements Runnable{
	
	public void run()
	{
		for(int i = 0 ; i < 10 ; i++)
		{
			System.out.println(i);
			if(i==6)
			{
				try
				{
					Thread.sleep(5000);
					
				}
				catch(Exception e)
				{
					System.out.println("df");
					break;
				}
			}
		}
	}
}

public class sir2 {
	
	public static void main(String a[])
	{
		Thread mainThread = Thread.currentThread();
		mainThread.setName("main-thread");
		mainThreadExecution();
	}
	
	public static void mainThreadExecution()
	{
		for(int i = 0 ; i < 10 ; i++)
		{
			
		}
	}

}



Threadx runx = new ThreadA();
Thread tx = new Thread(runx , "Thread-x");
tx. start(); 
