package Assignment1;

import java.util.*;

public class Account  implements Comparable<Account>
{
	String accountNumber;
	String userName;
	String password;
	KYCVerification kycdetails;
	ContactDetails contactDetails;
	int balance;
	int cashback;
	
		Account(String accountNumber,
		String userName,
		String password,
		KYCVerification kycdetails,
		ContactDetails contactDetails,
		int balance,
		int cashback)
		{
			this.accountNumber = accountNumber;
			this.balance = balance;
			this.cashback = cashback;
			this.contactDetails = contactDetails;
			this.userName = userName;
			this.password = password;
			this.kycdetails = kycdetails;
		}
	
		int deposite(int amount)
		{
			balance  = balance + amount;
			return balance;
		}
		
		int withdrawal(int amount)
		{
			balance = balance - amount + (int)(0.01f * amount);
			return balance;
		}
		
		public int compareTo(Account a)
	    {
	        return this.balance - a.balance; 
	    }

}


class CityCompare implements Comparator<Account>
{
    public int compare(Account a1, Account a2)
    {
    	return a1.contactDetails.cityName.compareTo(a2.contactDetails.cityName);
    }
}
 



