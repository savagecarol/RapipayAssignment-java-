package Assignment1;

import java.io.*;
import java.util.*;

public class Application {
	
	
	public static Account submitUserDetails()
	{
		Scanner sc = new Scanner(System.in);

		
		String accountNumber =  getAlphaNumericString();
		System.out.println("userName");
		String userName = sc.nextLine();
		System.out.println("password");
		String password = sc.nextLine();
		
		
		System.out.println("houseNumber");
		String houseNumber = sc.nextLine();
		System.out.println("locality");
		String locality = sc.nextLine();
		System.out.println("cityName");
		String cityName = sc.nextLine();
		System.out.println("stateName");
		String stateName = sc.nextLine();
		System.out.println("countryName");
		String countryName = sc.nextLine();
		System.out.println("pincode");
		String pincode = sc.nextLine();
		System.out.println("mobileNumber");
		String mobileNumber = sc.nextLine();
		System.out.println("emailId");
		long emailId = Integer.parseInt(sc.nextLine());
		ContactDetails contact = new ContactDetails(houseNumber,locality,cityName,stateName,countryName
				,pincode , mobileNumber, emailId);
		
	
		
		System.out.println("pan Number");
		String panNumber = sc.nextLine();
		System.out.println("adhar Number");
		long adharNumber = Integer.parseInt(sc.nextLine());	
		KYCVerification  kyc = new KYCVerification(panNumber  ,  adharNumber);
		
		
		System.out.println("Acccount balance > 500 input");
		int balance =  Integer.parseInt(sc.nextLine());	
		
		
		Account account = new Account(accountNumber , userName , password , kyc , contact , balance , 1);
		return account;
	}
	
	public static void doDepositOperation(Account user , int money )
	{
		System.out.println("*** money deposit *** ");	
		user.deposite(money);
	}
	
	public static void doWithdrawalOperations(Account user , int money)
	{
		System.out.println("*** money withdraw *** ");	
		user.withdrawal(money);
	}
	public static void printUserAllDetails(Account user)
	{
		System.out.println("*** genral *** ");	
		System.out.println("userName " + user.userName);
		System.out.println("account number " + user.accountNumber);
		System.out.println("balance " + user.balance);
		
		
		printUserContactDetails(user.contactDetails);
		printUserKYCDocumentDetails(user.kycdetails);
	}
	public static void printUserContactDetails(ContactDetails contact)
	{
		
		System.out.println("*** address *** ");	
		System.out.println(contact.houseNumber);
		System.out.println(contact.locality);
		System.out.println(contact.cityName);
		System.out.println(contact.stateName);
		System.out.println(contact.countryName);
		System.out.println(contact.pincode);
		
		System.out.println("*** contact *** ");	
		System.out.println(contact.mobileNumber);
		System.out.println(contact.emailId);
	}
	public static void printUserKYCDocumentDetails(KYCVerification kyc)
	{
		System.out.println("*** KYC *** ");	
		System.out.println(kyc.adharNumber);
		System.out.println(kyc.panNumber);
	}
	public static void printBalance(Account user)
	{
		System.out.println("*** balance ***");
		System.out.println("balance " + user.balance);
	}
	
	public static void changeMobileNumber(ContactDetails contact , String mobileNumber)
	{
		System.out.println("*** number updated ***");
		contact.mobileNumber = mobileNumber;
	}
	
	public static void changeEmailId(ContactDetails contact  , long emailId)
	{
		System.out.println("*** email updated ***");
		contact.emailId = emailId;
	}
	
	
	
	
	public static  String getAlphaNumericString()
    {
		int n = 6;
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) 
        {
            int index= (int)(AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        return sb.toString();
    }
	
	
	public static void printAllAccount(ArrayList<Account> acc)
	{
		acc.forEach((i) -> printUserAllDetails(i));	
	}
	
	public static void printAllAccountOfTreeSet(TreeSet<Account> acc)
	{
		acc.forEach((i) -> printUserAllDetails(i));	
	}
	
	public static void treeSetDefaultSort(TreeSet<Account> accountsT)
	{
		printAllAccountOfTreeSet(accountsT);
	}
	
	public static void sortByCitynameTreeSet(TreeSet<Account> accountsT)
	{
		 TreeSet<Account> ts = new TreeSet<Account>(new  CityCompare ());
		 accountsT.forEach((i) ->  ts.add(i));
		 printAllAccountOfTreeSet(ts);
	}
	
	
	public static void printAllAccountInrange(ArrayList<Account> account , int range1 ,int range2)
	{
		
		for(Account a : account)
		{
			if(a.balance > range1 && a.balance < range2)
			{
				 printUserAllDetails(a);
			}
		}
	}
	
	public static void printCityNameInFolder(ArrayList<Account> account , String cityName) 
	{
		String BASE_PATH = "C:\\Users\\dell\\Documents\\workspace-spring-tool-suite-4-4.10.0.RELEASE\\corejava-salary\\src\\Assignment1\\";
		
		 try {
		      File myObj = new File(BASE_PATH + cityName + ".txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		  	
				for(Account a : account)
					{
						if(a.contactDetails.cityName.equals(cityName))
						{
						    
					BufferedWriter out = new BufferedWriter(new FileWriter(BASE_PATH +cityName + ".txt", true));
					out.write(a.accountNumber + " " + a.userName);
					out.close();
							
						}	
					}
		 }
		     catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	
		
	}
	

	
}


