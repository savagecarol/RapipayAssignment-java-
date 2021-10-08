package onlineBankingApp;

import java.util.*;

interface Sequrity
{
	public boolean validateUser(String username , String password );
	
}
interface Themeable
{
	public String changeBackground(String themeName);
}

public class App {
	
	static Map<String , String> userdetails = new HashMap<String , String>();
	
	public App(String username ,String password)
	{
		userdetails.put(username, password); 
	}
	
	public static boolean login(String username , String password)
	{
		
		 Sequrity validate = (name , pass)->
		 {
			 System.out.println(name + " " +pass + " " + userdetails.containsKey(name) + " " + userdetails.get(name));
			 if(userdetails.containsKey(name))
			 {
				 if(pass.equals(userdetails.get(name)))
						 return true;
			 }
			
			 return false;
		 };
		 return validate.validateUser(username, password);
	}
	
	public static String themeName(String themename)
	{
		Themeable value = (name)-> themename;
		return value.changeBackground(themename);
	}
	
	
	public static boolean loginAny(String username , String password)
	{
		
		
		 Sequrity validate = new Sequrity()	
		 {
			 @Override
			 public boolean validateUser(String name , String pass)
			 {
			 System.out.println(name + " " +pass + " " + userdetails.containsKey(name) + " " + userdetails.get(name));
			 if(userdetails.containsKey(name))
			 {
				 if(pass.equals(userdetails.get(name)))
						 return true;
			 }
			
			 return false;
			 }
		 };
		 return validate.validateUser(username, password);
	}
		
	public static void main(String args[])
	{
		
		String user1  = "kar";
		String pass1 = "lol";
		
		String user2  = "ppp";
		String pass2 = "dsdfsdf";
		
		String user3  = "sdlfd";
		String pass3 = "ooooo";
		

		new App(user1 , pass1);
		new App(user2 , pass2);
		new App(user3 , pass3);
		
		boolean login  =  App.login(user1 , pass1);
		
		if(login)
		{
			System.out.println("user login");
			String newTheme  = App.themeName("pink");
			System.out.println("color changed " + newTheme);
		}
		else
		{
			System.out.println("not able to login");
		}
		
	}

}
