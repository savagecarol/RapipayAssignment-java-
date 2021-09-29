package day6task2;

public class EmailBy2d {	
	
	String emails[] = 
		{
				
				"pqr.com",
				"lol.com,",
				"ramesh@gmail.com",
				"rakesh@outlook.com",
				"lokesh@linkedin.com",
				"mahesh@gmail.com",
				"ganesh@gmail.com",
				"rajesh@outlook.com",
				"raj@lol.com",
				"abc.com"
				
		};
	
	public static boolean isValidEmail(String email)
	{
		int p = email.indexOf('@');
		int q = email.indexOf('.');
		if(p!=-1  && q!=-1 && q > p && q-p >=2 && email.endsWith(".com"))
			return true;
		return false;
	}
		public static void main(String[] args)
		{
			
			EmailBy2d ef = new EmailBy2d();
			
			String arr[][] = new String[10][2];
			
			for(int i = 0; i < 10 ;  i++)
			{
					arr[i][0] = "0";
					arr[i][1] = "0";
			}
			
			int k = 0;
			for(int i = 0 ; i < ef.emails.length ; i++)
			{
				
				if(isValidEmail(ef.emails[i]))
				{
					int loc = ef.emails[i].indexOf('@');
					String ext = ef.emails[i].substring(loc+1);
					ext = ext.substring(0 , ext.length() - 4);
					boolean flag= false;
					for(int j = 0 ; j < arr.length ; j++)
						{
							if(arr[j][0].equals(ext))
							{
								arr[j][1] = Integer.toString(Integer.valueOf(arr[j][1]) + 1) ;
								flag = true;
								break;
							}
						}
					if(flag == false)
					{
						arr[k][0] = ext;
						arr[k][1] = "1";
						k++;
					}
				}
				
				else
				{
					arr[k][0] = ef.emails[i];
					arr[k][1] = "NOT VALID";
					k++;
				}
								
			}
			
			for(int i = 0; i < 10 ;  i++)
				{
					if(arr[i][0].equals("0"))	continue;
					else System.out.println(arr[i][0] +  " : " + arr[i][1]);
				}
		}
	}