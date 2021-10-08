package day10task1;

import java.util.*;
import java.io.*;

public class App
{	
	final static String BASE_PATH = "C:\\Users\\dell\\Documents\\workspace-spring-tool-suite-4-4.10.0.RELEASE\\corejava-salary\\src\\day10task1\\";
	public static void main(String args[]) throws FileNotFoundException , IOException
	{
			 FileReader fr = new FileReader(BASE_PATH + "one.txt");
			 System.out.println("enter the word");
			 Scanner sc = new Scanner(System.in);
		     String name = sc.nextLine();
			 BufferedReader br = new BufferedReader(fr);
			 boolean flag = false;
				  int i = 1;	 
				  String line;
				while( (line = br.readLine()) != null )
				  {
					if(line.contains(name))
					 {					  
						  System.out.println("found in line " + i);
						  flag = true;
					  }
					  i++;
					}
				if(flag == false)
				 System.out.println("Not found");
				  fr.close();
			}
			  
			 
}


