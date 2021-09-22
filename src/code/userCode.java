package code;
import java.util.*;
public class userCode {
	
	public static void main(String args[])
	{
		userFormSalary();
		
	}
	
	public static void userFormSalary()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter baseSalary : ");
		float baseSalary = sc.nextFloat();
		BusinessLogic.calculateTax(baseSalary); 	
	}
	
	public static void printSalaryBreakUp(salarydetails e)
	{
		System.out.println("Basic Salary : " + e.baseSalary);
		System.out.println("HRA : " + e.hra);
		System.out.println("DA : "+ e.dra);
		System.out.println("Gross Salary : " + e.grossSalary);
		System.out.println("Net Salary : " + e.netSalary);
			
	}
	
}
