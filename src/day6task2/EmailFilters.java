package day6task2;

public class EmailFilters {
	
String emails[] = {
			
			"ramesh@gmail.com",
			"rakesh@outlook.com",
			"lokesh@linkedin.com",
			"mahesh@gmail.com",
			"ganesh@gmail.com",
			"rajesh@outlook.com",
			"abc.com"
	};


	public static void main(String[] args)
	{
		
		EmailFilters ef = new EmailFilters();
		int gmail = 0 , outlook = 0 , linkedin = 0;
		
		for(int i = 0 ; i < ef.emails.length ; i++)
		{
			String em = ef.emails[i].substring(0 , ef.emails[i].length() - 4);
			if(em.endsWith("gmail"))
				gmail++;
			else if(em.endsWith("outlook"))
				outlook++;
			else if(em.endsWith("linkedin"))
				linkedin++;
		}
		
		System.out.println("No of gmail : " + gmail );
		System.out.println("No of outlook : " + outlook );
		System.out.println("No of linkedin : " + linkedin );
	}
}
