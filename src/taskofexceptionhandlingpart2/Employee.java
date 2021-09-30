package taskofexceptionhandlingpart2;
import java.util.*;

public class Employee {
	
	private String idNum;
	private int hourlyWage;
	
	Employee(String idNum , int hourlyWage)
	{
			if(hourlyWage > 6 && hourlyWage < 50)
				{
						this.idNum = idNum;
						this.hourlyWage = hourlyWage;
				}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	
		
		boolean isLogin = true;
		while(true)
		{
			System.out.println("choose 1 to input");
			System.out.println("choose 2 to exit ");
			int option = Integer.parseInt(sc.nextLine());
			if(option == 1 )
			{
				System.out.println("enter id num");
				String idNum = sc.nextLine();
				System.out.println("enter hourly wage");
				int hourlyWage = Integer.parseInt(sc.nextLine());
		
				try
				{
					if(hourlyWage > 6 && hourlyWage < 50)
						{
						Employee e = new Employee(idNum , hourlyWage );
						System.out.println(e.idNum + " " + e.hourlyWage + "---->" + "employee created");
						}
					else
						throw new EmployeeException(idNum , hourlyWage * 5);
				}
				catch(EmployeeException e)
				{
					System.out.println(e);
					System.out.println(e.getMessage());
				}
			}
			else
				isLogin = false;	
		}
	
	}

}
