package day2task1;

import java.util.Scanner;

public class inputs {
	
	
	public static void main(String args[])
	{
		inputs.inputDetails();
	}
	public static void inputDetails()
	{
		Scanner sc = new Scanner(System.in);
		float deposit = sc.nextFloat();
		int year = sc.nextInt();
		Bank p = new Bank();
		p.calculate(deposit, year);
	}
}
