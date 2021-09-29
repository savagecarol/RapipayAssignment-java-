package day9;

class p
{
	public int doDivision(int a , int b)
	{
		try
			{
			System.out.println("aa");
				 a = 50/0;
			}
		catch(ArrayIndeaxOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println("dsdf");
			
		}
		System.out.println("aa");
		
		return 1;
	}
	
}

public class exception1 {
	public static void main(String args[])
	{
		p obj = new p();
		int res = obj.doDivision(10 , 0);
		System.out.println(res);
	}
}
