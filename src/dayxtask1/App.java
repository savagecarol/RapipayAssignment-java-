package dayxtask1;

interface MyInterface
{
	public void myTest();
}

public class App 
{
	void myTestByLambda()
	{
		MyInterface q = ()->{System.out.println("by lambda");};
		q.myTest();
	}	
	void myTestAnonymous()
	{
		MyInterface p = new MyInterface()
		{
					@Override
					public void myTest()
					{
						System.out.println("by anonymous");
					}
		};
		p.myTest();
	}

	public static void main(String args[])
	{
		App user = new App();
		user.myTestByLambda();
		user.myTestAnonymous();

	}
}
