package Assignment2task3;

import java.util.Scanner;

public class User {
	
	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter type of account, S for savings an C for current");
	String type=sc.nextLine();
	
	if(type.equals("C")){
		Curr_acc c=new Curr_acc();
	
	System.out.println("Enter  balance");
	int balance=sc.nextInt();
	c.setBalance(balance);
	
	System.out.println("Enter deposit");
	int deposit=sc.nextInt();
	c.deposit(deposit);
	
	System.out.println("Enter withdrawl amount");
	int withdrawl=sc.nextInt();
	
	c.withdrawl(withdrawl);
	
	c.interestFacility();
	
	c.penalty();
	
	}	
	else if(type.equals("S"))
	{
		Sav_acc s=new Sav_acc();
	
	System.out.println("Enter  balance");
	int balance=sc.nextInt();
	s.setBalance(balance);
	
	System.out.println("Enter deposit");
	int deposit=sc.nextInt();
	s.deposit(deposit);
	
	System.out.println("Enter withdrawl amount");
	int withdrawl=sc.nextInt();
	
	s.withdrawl(withdrawl);
	
	s.display();
	
	s.calculateInterest();
	
	s.issueCheque();
	
	s.penalty();
	}
	else {
		System.out.println("Account not recognized");
		return;
	}
	}
	
	
		
}

