package day3task1;

import java.util.Scanner;

public class Calc
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		calculate p = new calculate(a , b);
		p.add();
	}
}