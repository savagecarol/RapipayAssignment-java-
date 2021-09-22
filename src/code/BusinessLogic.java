package code;

public class BusinessLogic {
	
	
	public static void calculateTax(float baseSalary)
	{
		
		float hra = getHRA(baseSalary);
		float dra  = getDRA(baseSalary);
		float grossSalary  = baseSalary + hra + dra;
		float netSalary = getTax(grossSalary);
		
		salarydetails salary = new salarydetails(baseSalary , hra , dra , grossSalary ,  netSalary);
		userCode.printSalaryBreakUp(salary);
	}
		
	public static float getHRA(float baseSalary)
	{
		return baseSalary * 0.15f;
	}
	
	public static float getDRA(float baseSalary)
	{
		return baseSalary * 0.60f;
	}
	
	public static float getTax(float netSalary)
	{
			return (netSalary>=500000 && netSalary <=1000000) ? netSalary * 0.20f : netSalary ;
	}
	

}
