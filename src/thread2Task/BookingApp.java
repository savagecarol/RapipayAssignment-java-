package thread2Task;

import java.util.*;

public class BookingApp {
	

	
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		BookingAppController control = new BookingAppController();

		
		boolean isLogin = true;
		int i = 1;
		while(isLogin)
		{
			System.out.println("***** WELCOME TO SEAT PORTAL *****");
			
			System.out.println("wanna book seat :  press 1" );
			System.out.println("log out : press 2");
			
			int option = Integer.parseInt(sc.nextLine());
			switch(option)
			{
				case 1:
					System.out.print("enter the name ");
					String user = sc.nextLine();
					System.out.print("enter the number of seats you want to book ");
					int seats = Integer.parseInt(sc.nextLine());
					new BookingAppUsers(user , seats , control);
					break;
					
				case 2: 
					isLogin = false;
					break;
					
				default :
					System.out.println("please choose the correct option");
					break;
			}
			
			if(i%3 ==0 || isLogin == false)
					control.printSeat();
			i++;
		}


	
	}
}	


