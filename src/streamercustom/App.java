package streamercustom;

import java.util.Comparator;
import java.util.function.Supplier;
import java.util.stream.Stream;

class  Employee
{
	int empId;
	String name;
	int money;
	public Employee(int empId, String name, int money) {
		this.empId = empId;
		this.name = name;
		this.money = money;
	}
}

public class App {
	
	public static void main(String args[])
	{
		doMinMax();
	}
	public static void doMinMax()
	{
		Employee e1 = new Employee(1 , "A" , 3000);
		Employee e2 = new Employee(1 , "B" , 2000);
		Employee e3 = new Employee(1 , "C" , 4000);
		Employee e4 = new Employee(1 , "D" , 5000);
		Employee e5 = new Employee(1 , "E" , 1000);
		
		Comparator<Employee> maxEmpSalaryCompare = (emp1 , emp2) ->{
			return emp1.money - emp2.money;
		};
		Comparator<Employee> minEmpSalaryCompare = (emp1 , emp2) ->{
			return emp2.money - emp1.money;
		};
		
		Supplier<Stream<Employee>> streamSupply = () -> Stream.of(e1 , e2 ,  e3 , e4 , e5);
		Employee maxE = streamSupply.get().max(maxEmpSalaryCompare).get();
		System.out.println(maxE.money);
		Employee minE = streamSupply.get().min(maxEmpSalaryCompare).get();
		System.out.println(minE.money);
	
	}

}
