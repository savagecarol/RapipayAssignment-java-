package day2task1;
import java.util.*;

public class Bank {
	
	public static float calculateIntrest(float ei)
			{
				return ei * 0.09f;
			}
	public static float calculateAmount(float ca  , float ei)
			{
				return ca + ei;
			}
	public static float calculateEi(float deposit , float prevAmount)
			{
					return deposit + prevAmount;
			}
	
	public static void calculate(float deposit , int year)
	{
		
		float prevAmount = 0;
		for(int i = 1 ; i <=year ; i++)
			{	
					float ei = calculateEi(deposit , prevAmount);
					float ca = calculateIntrest(ei);
					float amount = calculateAmount(ca , ei);
					accountdetail e = new accountdetail(deposit , ei , ca , amount );	
					Bank.print(e , i);
					deposit = deposit * 0.1f + deposit;
					prevAmount = amount;
					
			}
	}
	
	public static void print(accountdetail e ,int year)
	{
		
		System.out.println("Year : " + (int)year);
		System.out.println("depost money : " +(int) e.deposit);
		System.out.println("EI : " + (int)e.ei);
		System.out.println("CA : " + (int)e.ca);
		System.out.println("Amount : " + (int)e.amount);
		
		System.out.println("\n*****************************");
	}
	
}
