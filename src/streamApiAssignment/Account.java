package streamApiAssignment;

import java.util.List;

public class Account
{


	int accountNumber;
	String accountHolderName;
	int balance;
	List<Policy> policies;
	ContactDetails contactDetails;
	
	public Account(int accountNumber, String accountHolderName, int balance, List<Policy> policies,
			ContactDetails contactDetails) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.policies = policies;
		this.contactDetails = contactDetails;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", balance="
				+ balance + ", policies=" + policies + ", contactDetails=" + contactDetails + "]";
	}


	
}