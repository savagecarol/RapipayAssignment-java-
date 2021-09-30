package day9;

class p
{
	public int doDivision(int a , int b)
	{
		try
			{
				 a = 50/0;
			}

		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
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
