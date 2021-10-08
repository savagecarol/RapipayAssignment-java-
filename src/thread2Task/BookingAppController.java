package thread2Task;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class BookingAppController
{
	
	Seat arr[] = new Seat[20];
	int fillSeat = 0;
		

	BookingAppController()
	{
		arr = new Seat[20];
		for(int i = 0 ; i < 20 ; i++)
		{
			arr[i] = new Seat(i , false);
		}
	}
	
	
	public void bookSeat(String userName, int seat)
	{
		Random random = new Random();
		
		int emptySeat = 20 - fillSeat;
		
		if( emptySeat >= seat)
		{
			
			while(seat!=0)
			{
				int getSeat =  ThreadLocalRandom.current().nextInt(0, 20);
				if(arr[getSeat].isStatus() == false)
					{	
					arr[getSeat].setStatus(true);
					arr[getSeat].setSeatNumber(getSeat);
					fillSeat++;				
					System.out.println("seat booked " + getSeat + " ----> " + userName);
					seat--;
					}
			}
		}
		else
		{
			System.out.println("oops! that number of seats are not available : no of seat available : " + emptySeat);
		}
	
		
	}
	
	public void printSeat()
	{
		for(int i = 0 ; i < 20 ; i++)
		{
			if(arr[i].isStatus() == false)
			System.out.println(arr[i].getSeatNumber());
		}
	}
	
	

}

	
