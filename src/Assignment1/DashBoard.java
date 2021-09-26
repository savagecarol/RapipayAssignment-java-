package Assignment1;

import java.util.Scanner;

public class DashBoard {
	
	
	public static void userDashboard(Account user)
	{
		
		Scanner sc = new Scanner(System.in);
		boolean isLogin = true;
		
		while(isLogin)
		{
			System.out.println("Do deposit operations : press 1");
			System.out.println("Do withdrawl operations : press 2");
			System.out.println("Print user All Details : press 3");
			System.out.println("Print user contact details : press 4");
			System.out.println("Print User KYC document details : press 5");
			System.out.println("Print Balance : press 6");
			System.out.println("Change Mobile Number : press 7");
			System.out.println("Change Email Id : press 8");
			System.out.println("logout : press 9");
			
			int option =  Integer.parseInt(sc.nextLine()) , money;
			switch(option)
			{
				case 1 : 
						 System.out.println("enter money to deposit");
						 money = Integer.parseInt(sc.nextLine());
						 Application.doDepositOperation(user , money); break;
					
				case 2 : 
					     System.out.println("enter money to withdrawl");
					 	 money = Integer.parseInt(sc.nextLine());
						 Application.doWithdrawalOperations(user , money); break;
					 
				case 3 : Application.printUserAllDetails(user); break; 
					
				case 4 : Application.printUserContactDetails(user.contactDetails); break;
					 
				case 5 : Application.printUserKYCDocumentDetails(user.kycdetails); break;
				
				case 6 : Application.printBalance(user); break;
					
				case 7 :
							System.out.println("new Mobile Number ");
							String mobileNumber = sc.nextLine();
							Application.changeMobileNumber(user.contactDetails , mobileNumber);
							break;
				
				case 8 :	System.out.println("new EmailId ");
							long emailId = Integer.parseInt(sc.nextLine());
							Application.changeEmailId(user.contactDetails , emailId);
							break;
				
				
				case 9 :  System.out.println("logout");
							isLogin = false;
							break;
					
				default: System.out.println("logout");
							isLogin = false;
							break;
			}
		}
	}

}
