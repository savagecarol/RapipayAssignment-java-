package day9;

class pqr
{
	public int doDivision(int a , int b)
	{
		try
			{
			System.out.println("aa");
				 a = 50/0;
			}

		System.out.println("aa");
		
		return 1;
	}
	
}

public class exception2 {
	public static void main(String args[])
	{
		pqr obj = new pqr();
		int res = obj.doDivision(10 , 0);
		System.out.println(res);
	}
}
