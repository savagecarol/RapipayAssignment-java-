package day2task3;
import java.util.*;

public class Employee {
	String name;
	char gender;
	double year;
	String designation;
	double basicSalary;
	String status;
	
	Employee(String name  , char gender , double year)
	{
		this.name = name;
		this.gender = gender;
		this.year = year;
		
		if(year >=3)
		{
			this.designation = "ITA";
			this.basicSalary = 15000;
			
		}
		else
		{
			this.designation = "ASE";
			this.basicSalary = 10000;
		}

		this.status = "Active";
	}
	
	
	public static double promoteEmp(Employee e)
	{
		double percentAdd = 0;
		if(e.designation == "ASE")
		{
			e.designation = "ITA";
			  percentAdd = e.basicSalary * 0.05f; 
		}
			
		else if(e.designation == "ITA")
		{
			e.designation = "AST";
			  percentAdd = e.basicSalary * 0.08f;
			
		}
		else if(e.designation == "AST")
		{
			e.designation = "ASC";
			  percentAdd = e.basicSalary * 0.10f;
		}
		return e.basicSalary + percentAdd; 
	}
	public static void applyForLWP(Employee e)
	{	
		
			e.setBasicSalary(0);
			System.out.println(e.getBasicSalary());
			
			e.setStatus("Not active");
			System.out.println(e.getStatus());
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public double getYear() {
		return year;
	}


	public void setYear(double year) {
		this.year = year;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public double getBasicSalary() {
		return basicSalary;
	}


	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	

}

class Input
{
	public static void main(String args[])
	{
		Employee e = new Employee("Kartikeya Sharma"  , 'M',  3 );
		
	}
}