package ThreadConcept;







class ThreadA implements Runnable{
	
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


public class sir1 {
	
	public static void main(String args[])
	{
		ThreadA runA = new ThreadA();
		Thread ta = new Thread(runA , "Thread-A");
		ta. start(); 
	}

}






