package day9;
import java.io.*;
public class exception3 {
	public static void main(String rgs[])
	{
		try
		{
			BufferedReader in = new BufferedReader(new FileReader("foo.in"));
			in.ready();
		}
		catch(Exception f)
		{
			System.out.println("Exception");
		}
		finally
		{
			System.out.println();
		}
		
	}
	
	public boolean ready() 
            {
				return true;
            }
} 