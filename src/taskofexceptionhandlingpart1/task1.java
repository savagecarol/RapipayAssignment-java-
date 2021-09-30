package taskofexceptionhandlingpart1;

import java.util.Scanner;

public class task1 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			int input = sc.nextInt();
			System.out.println("lets print input "+input);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("invalid input");
		}
	
	}

}
