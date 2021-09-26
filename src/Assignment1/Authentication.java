package Assignment1;

import java.util.*;

public class Authentication {
	
	public static void main(String args[])
		{
				
			ArrayList<Account> accounts = new ArrayList<Account>();
		
				Scanner sc = new Scanner(System.in);
				while(true)
				{
					
					System.out.println("Log in : press 1");
					System.out.println("sign Up : press 2");
					int option =  Integer.parseInt(sc.nextLine());	
					
					switch(option)
					{
						case 1 :
							System.out.println("enter username ");
							String userName = sc.nextLine();
							System.out.println("enter password ");
							String password = sc.nextLine();
							if(checkAccount(accounts , userName , password))
							{
								 Account currAccount = getAccount(accounts , userName , password);
								 DashBoard.userDashboard(currAccount);
							}
							else
							{
								System.out.println("Credentials are not correct");
							}
								
							break;
								
						case 2 : accounts.add(Application.submitUserDetails()); break;
						case 3 : System.exit(0);	
						default : System.exit(0);

					}
			}
	
	
		
		}
	
	
	
	
	static boolean checkAccount(ArrayList<Account> accounts , String userName ,  String password)
		{
		
			for(int i = 0 ; i < accounts.size() ; i++)
			{
				if(userName.equals(accounts.get(i).userName) &&  password.equals(accounts.get(i).password))
						return true;
			}
			return false;
		
		}
	
	
	public static Account getAccount(ArrayList<Account> accounts , String userName ,  String password)
	{
		for(int i = 0 ; i < accounts.size() ; i++)
			{
				if(userName.equals(accounts.get(i).userName) &&  password.equals(accounts.get(i).password))
					return accounts.get(i);
			}
		return null;
	}

}
