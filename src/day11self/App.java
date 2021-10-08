package day11self;

import java.util.*;

class Employee {

	private String name;
	private String gender;
	private double year;
	private double basicSalary;

	Employee(String name, String gender, double year, double basicSalary) {
		this.name = name;
		this.gender = gender;
		this.year = year;
		this.basicSalary = basicSalary;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getYear() {
		return year;
	}

	public void setYear(double year) {
		this.year = year;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

}

public class App {

	public static void prints(int key, Employee e) {
		System.out.println(
				key + " ----> " + e.getName() + " " + e.getGender() + " " + e.getYear() + " " + e.getBasicSalary());
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of employee you want to input");
		int input = Integer.parseInt(sc.nextLine());
		HashMap<Integer, Employee> data = new HashMap<Integer, Employee>();
		for (int i = 0; i < input; i++) {
			System.out.println("enter name");
			String name = sc.nextLine();
			System.out.println("enter gender");
			String gender = sc.nextLine();
			System.out.println("enter age");
			int age = Integer.parseInt(sc.nextLine());
			System.out.println("enter salary");
			int salary = Integer.parseInt(sc.nextLine());
			Employee e = new Employee(name, gender, age, salary);
			data.put(i, e);
		}

		

		// by iterator
		System.out.println("by iterator loop");
		Iterator<Integer> itr = data.keySet().iterator();
		while (itr.hasNext()) {
			int key = itr.next();
			Employee e = data.get(key);
			prints(key, e);
		}

		// by for each
		System.out.println("by for each loop");
		data.forEach((key, value) -> {
			prints(key, value);
		});

	}
}
