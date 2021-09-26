package learn;


class value
{
	
	public int a = 0;
	public static int b = 1;
	private static int c = 2;
	private int d = 3;
	
	
	public value(int x)
	{
		a=x;
	}
	
	
	
	public int getc()
	{
		return c;
	}
	
	public int getd()
	{
		return d;
	}
	
	
}

public class extra 
{
	
	public static void main(String args[])
	{
		
		System.out.println(value.b); // no error
		
		value obj = new value(1);
		
		System.out.println(obj.a);  
		System.out.println(obj.b);  
		System.out.println(obj.getc()); 
		System.out.println(obj.getd()); 
		
	}

}


