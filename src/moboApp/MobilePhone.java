package moboApp;
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
		System.out.println("Enter the App Name which you want to Execute");
		Scanner sc = new Scanner(System.in);
		String appName = sc.nextLine();
		
		for(int i = 0 ; i < app.length ; i++)
		{
			if(appName.equals(app[i].getAppName()) )
			{
				if(app[i].getMinimumMemory() <= MAX_MEMORY_SPACE)
				{
					System.out.println("app can be executed");
					System.out.println(app[i].toString());
					
					return;
				}
				
				else if(app[i].getMinimumMemory() > MAX_MEMORY_SPACE)
				{
					System.out.println("app can not executed because of memory space");
					return;
				}
			}
		}
		System.out.println("app not found ");
	}

}
