package Question1;

import java.util.Scanner;

public class table {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter table that you want to print");
		int n = sc.nextInt();
		System.out.println("enter starting range number");

		int start = sc.nextInt();
		
		System.out.println("enter ending range number");
		int end = sc.nextInt();
		
		for(int i = start ; i <=end ; i++)
		{
			System.out.println(n + " * " + i + " :- " + (n*i) );
		}
		
	}

}
