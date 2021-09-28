package Assignment2task6;

import java.util.Scanner;

public class UseChildren {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter name of male");
		String name=sc.next();
		Male m=new Male(name);
		
		System.out.println("Enter name of female");
		String name1=sc.next();
		Female f=new Female(name1);
		
		
	}
}
