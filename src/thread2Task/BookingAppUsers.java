package thread2Task;

import java.util.Scanner;

public class BookingAppUsers implements Runnable
{
	String user;
	int seat;	
	BookingAppController control = new BookingAppController();
	BookingAppUsers(String user , int seat , BookingAppController control )
	{
		
		this.user = user;
		this.seat = seat;
		this.control = control;
		new Thread(this).start();	
	}
		
	public void run()
	{
			control.bookSeat(user , seat);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
	
}
