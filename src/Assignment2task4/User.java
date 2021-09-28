package Assignment2task4;

import java.util.Scanner;

public class User {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter dish id");
		int id=sc.nextInt();
		
		Restaurant r=new Restaurant();
		r.getDish(id);
		
		Dish d=r.getDish(id);
		
		
		if(d==null) {
			System.out.println("Dish is not avaliable");
		}
		else {
			System.out.println(d.toString());
		}
	}

}
