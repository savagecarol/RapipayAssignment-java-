package streamercustom;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class streamgenral {
	
	
	
	public static void main(String args[])
	{
		System.out.println("min max");
		doMinMax();
		System.out.println("filter");
		doFilter();
		System.out.println("map task");
		doMapTask();
		
	}
	public static void doMinMax()
	{
		Employee e1 = new Employee(1 , "A" , 3000);
		Employee e2 = new Employee(1 , "B" , 2000);
		Employee e3 = new Employee(1 , "C" , 4000);
		Employee e4 = new Employee(1 , "D" , 5000);
		Employee e5 = new Employee(1 , "E" , 1000);

		Comparator<Employee> minEmpSalaryCompare = (emp1 , emp2) ->{
			return emp2.money - emp1.money;
		};
		
		Employee minE = Stream.of(e1 , e2 ,  e3 , e4 , e5).min(minEmpSalaryCompare).get();
		System.out.println(minE.money);
	
	}
	
	
	public static void doFilter()
	{
		Employee e1 = new Employee(1 , "A" , 3000);
		Employee e2 = new Employee(1 , "B" , 2000);
		Employee e3 = new Employee(1 , "C" , 4000);
		Employee e4 = new Employee(1 , "D" , 5000);
		Employee e5 = new Employee(1 , "E" , 1000);

		Stream<Employee> eList = Stream.of(e1 , e2 ,  e3 , e4 , e5);
		Object[] cList = eList.filter(c -> c.money > 2000 && c.money < 5000).collect(Collectors.toList()).toArray();
		
		for(int i = 0 ; i < cList.length ; i++)
		{
			Employee e = (Employee)cList[i];
			System.out.println(e.name + " " + e.money);
		}
	
	}
	
	public static void doMapTask()
	{
		Employee e1 = new Employee(1 , "A" , 3000);
		Employee e2 = new Employee(1 , "B" , 2000);
		Employee e3 = new Employee(1 , "C" , 4000);
		Employee e4 = new Employee(1 , "D" , 5000);
		Employee e5 = new Employee(1 , "E" , 1000);

		Stream<Employee> eList = Stream.of(e1 , e2 ,  e3 , e4 , e5);
		Object mList[] = eList.map(e -> e.money*5).collect(Collectors.toList()).toArray();

		for(int i = 0 ; i < mList.length ; i++)
		{
			Employee e = (Employee)mList[i];
			System.out.println(e.name + " " + e.money);
		}
	

	}

}
