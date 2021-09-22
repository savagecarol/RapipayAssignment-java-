package day3task1;

import java.util.Scanner;

public class Calculator 
{
	int a , int b;
	Calculator(int a , int b)
	{
		this.a = a;
		this.b = b;
	}
	
	int add()
	{
		return a+b;
	}
	int subtract()
	{
		return a-b;
	}
	int multiply()
	{
		return a*b;
	}
	int divide()
	{
		return a/b;
	}
}


public class Calc
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Calculator p = new Calculator(a , b);
		p.add();
	}
}