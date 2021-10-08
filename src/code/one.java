package code;

import java.util.HashSet;
import java.util.Objects;

class Employee
{
	int a;
	int b;
	Employee(int a , int b)
	{
		this.a = a;
		this.b = b;
	}
	Employee(Employee e1)
	{
		this.a = e1.a;
		this.b = e1.b;
	}
	@Override
	public int hashCode()
	{
		return 1 ;
	}
	
	@Override
	public boolean equals(Objects b)
	{
		return true ;
	}
	
}
public class one{
	
	public static void main(String a[])
	{
		Employee e1 = new Employee(1 , 2);
		Employee e2 = new Employee(1 , 2);
		Employee e3 = new Employee(1 , 4);
		Employee e4 = new Employee(1 , 5);
		
//		Employee e5 = e1;
		
		System.out.println(e1 == e2);
		System.out.println(e1 == e4);
		
		System.out.println(e1.equals(e3));
		
//		System.out.println(e1.equals(e5));
//		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		
		
		HashSet<Employee> s = new HashSet<>();
//		s.add(e5);
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		System.out.println(s);
	
	}
}
