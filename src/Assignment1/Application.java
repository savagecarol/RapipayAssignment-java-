package Assignment1;

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

	
}


