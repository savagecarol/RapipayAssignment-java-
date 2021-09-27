package learn;

public class first {
	
	static
	{
		System.out.println("static");
	}
	{
		System.out.println("init");
	}
	first()
	{
		System.out.println("constructor");
	}
	public static void main(String args[])
	{
		System.out.println(p);
		first f = new first();// static > main > init > constructor
		//(init working because of the creation of the object )

	}
}


