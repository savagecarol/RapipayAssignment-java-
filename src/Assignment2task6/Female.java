package Assignment2task6;

import java.util.Scanner;

public class Female extends Child {
	
	Scanner sc=new Scanner(System.in);
	
	public Female(String name) {
		super("Female" ,name);
		System.out.println("Enter age");
		int age=sc.nextInt();
		setAge(age);
		display();
		
}
	@Override
	public void display() {
		System.out.println("Name: "+this.name+" Age :"+this.age+" Gender: "+this.gender );
}
	@Override
	public void setAge(int age) {
		this.age=age;
	}
}