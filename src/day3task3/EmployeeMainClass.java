package day3task3;

import java.util.*;


 class Employee {

	private int id;
	private String name;
	private int salary;
	private String designation;
	
	public Employee(String name,int salary)
	{
		this.name = name;
		this.salary = salary;
		Random rd = new Random();
		this.id = rd.nextInt(); // auto generated through random number
	}
	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	
	
	public static Employee getEmployeeById(int id , Employee employee[])
	{
		for(int i = 0 ; i < employee.length ; i++)
		{
			if(id == employee[i].getId())
			{
				return employee[i];
			}	
		}
		return null;
	}
	
	
	public static Employee getEmployeeByName(String name , Employee employee[])
	{
		for(int i = 0 ; i < employee.length ; i++)
		{
			if(name == employee[i].getName())
			{
				return employee[i];
			}
		}
		return null;
	}
	
	
	public static Employee getEmployeeByDesignation(String designation , Employee employee[])
	{
		for(int i = 0 ; i < employee.length ; i++)
		{
			if(designation == employee[i].getName())
			{
				return employee[i];
			}
		}
		return null;
	}
		
}


public class EmployeeMainClass
{
	
	public static void prints(Employee employee)
	{
		if(employee != null)
		{
		System.out.println("Employee id " + employee.getId());
		System.out.println("Employee name " + employee.getName());
		System.out.println("Employee salary" + employee.getSalary());
		System.out.println("employee designation "+employee.getDesignation());
		}
		else
		{
			System.out.println("Employee Not Found");
		}
		System.out.println("************************************");
		
	}
	
	
	
	public static void main(String args[])
	{
		Employee employee[] = new Employee[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < 3 ; i++)
		{
			 String name = sc.next();
			 int salary = sc.nextInt();
			 employee[i] = new Employee(name , salary);
			 System.out.println("Employee " + (i) + " details" );
			 prints(employee[i]);
		}
		
		prints(Employee.getEmployeeByName("vrr" , employee));
		
		
	}
}
