package taskofexceptionhandlingpart3;
import java.util.*;

public class MobilePhone {
	public static final int MAX_MEMORY_SPACE = 300;
	
	public static void main(String args[])
	{
		MobilePhoneOS mpos = new MobilePhoneOS();
		appRunner(mpos.getAllAppInfo());
	}	
	public static void appRunner(App app[])
	{
		Scanner sc = new Scanner(System.in);
		boolean isLogin = true;
		int currMemory = 0;
		while(isLogin)
		{
			System.out.println("choose 1 to on App");
			System.out.println("choose 2 to off App");
			System.out.println("choose 3 to exit ");
			int option = Integer.parseInt(sc.nextLine());
			boolean flag = false;
			if(option == 1)
			{	
				
				System.out.println("Enter the App Name which you want to on");
				String appName = sc.nextLine();
						
				for(int i = 0 ; i < app.length ; i++)
					{
						if(appName.equals(app[i].getAppName()))
						{	
							try
							{
							currMemory = currMemory + app[i].getMinimumMemory();
								if(currMemory<= MAX_MEMORY_SPACE)
								{	
									System.out.println("app on" + app[i].toString());
									flag = true;
									break;
								}
								else
								{
									currMemory = currMemory - app[i].getMinimumMemory();
									throw new InsufficientMemoryException("Insufficient memory space app cannot be executed");
								}
							}
							catch(InsufficientMemoryException e)
							{
								flag = true;
								System.out.println(e);
								System.out.println(e.getMessage());
							}
							
							break;
						}
					}	
			
				}
			else if(option == 2)
			{
				
				System.out.println("Enter the App Name which you want to off");
				String appName = sc.nextLine();
				for(int i = 0 ; i < app.length ; i++)
				{
					if(appName.equals(app[i].getAppName()))
					{
						currMemory = currMemory - app[i].getMinimumMemory();
						System.out.println("app off " +  app[i].toString());
						flag = true;
						break;
					}
				}
				if(currMemory < 0) currMemory = 0;
				
			}
			else {
				isLogin = false;
			}
			
			if(flag == false)
				System.out.println(" app not found " );	
			
			System.out.println("memory used by system " + currMemory + "/n");
		}
		
		
	}

}
