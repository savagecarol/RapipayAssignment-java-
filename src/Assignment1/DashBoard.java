package Assignment1;

import java.util.*;

public class DashBoard {
	
	
	public static void userDashboard(Account user)
	{
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Account> account = Authentication.accounts; 
		TreeSet<Account> accountsT = Authentication.accountsT; 
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
		
			// extra
			
			System.out.println("Check all Account : press 9");
			System.out.println("filter on the basis of ranges : press 10");
			System.out.println("filter on the basis of city name and store in fil= : press 11");
			
			
			// tree set task
			
			
			System.out.println("see all Account bt tree set  : press 12");
			System.out.println("Store Accounts in TreeSet and Sort Account based on CityName. : press 13");
			System.out.println("Print Accounts based on Balance : press 14");
			
			
			
			
			System.out.println("logout : press 15");
			
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
				
				case 9 :  	Application.printAllAccount(account);
							break;
				
				case 10 :  	System.out.println("Enter range 1");
							int range1  =  Integer.parseInt(sc.nextLine());
							System.out.println("Enter range 2");
							int range2  =  Integer.parseInt(sc.nextLine());
							Application.printAllAccountInrange(account , range1 , range2);
							break;
				
				case 11 :  	System.out.println("Enter city name");
							String cityName  =  sc.nextLine();
							Application.printCityNameInFolder(account , cityName);
							break;
							
				case 12 :  Application.printAllAccountOfTreeSet(accountsT);
				
				case 13 :   Application.treeSetDefaultSort(accountsT);
				
				
				case 14 :  Application.sortByCitynameTreeSet(accountsT);
							
										
				case 15 :  Application.treeSetDefaultSort(accountsT);
					
				default: System.out.println("logout");
							isLogin = false;
							break;
			}
		}
	}

}
