package moboApp;

public class MobilePhoneOS {
	
	public App[] getAllAppInfo()
	{
		App apps[] = new App[5];
		apps[0] = new App("Whatsapp" , 20);
		apps[1] = new App("Facebook" , 520);
		apps[2] = new App("LinkedIn" , 400);
		apps[3] = new App("Gmail" , 120);
		apps[4] = new App("Camera" , 80);
		return apps;
	}
}
