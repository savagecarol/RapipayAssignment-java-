package day6task2;

import java.util.Scanner;

public class EmailFiltersInput {
	
	public static void main(String[] args)
	{
		
		int gmail = 0 , outlook = 0 , linkedin = 0;
		
		boolean isLogin = true;
		while(isLogin)
		{	
			Scanner sc = new Scanner(System.in);
			System.out.println("press 1 for email press 2 for exit");
			int choose = Integer.parseInt(sc.nextLine());
			if(choose == 1)
			{
				
				System.out.println("enter email");
				String email = sc.nextLine();
				String subEmail = email.substring(0 , email.length() - 4);
				if(subEmail.endsWith("gmail"))
					gmail++;
				else if(subEmail.endsWith("outlook"))
					outlook++;
				else if(subEmail.endsWith("linkedin"))
					linkedin++;
			
			}
			else
				isLogin = false;
		
		}
		System.out.println("No of gmail : " + gmail );
		System.out.println("No of outlook : " + outlook );
		System.out.println("No of linkedin : " + linkedin );
	}
}
