package day10FileHandle;

import java.util.*;
import java.io.*;

public class first {
	final static String BASE_PATH = "C:\\Users\\dell\\Documents\\workspace-spring-tool-suite-4-4.10.0.RELEASE\\corejava-salary\\src\\day10FileHandle\\";
	public static void main(String args[])
	{
		try {
			System.out.println("enter the file name");
			Scanner sc = new Scanner(System.in);
			String fileName = sc.nextLine();
		      File myObj = new File(BASE_PATH + fileName);
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		        System.out.println("path: " + myObj.getAbsolutePath());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	
	
	}

}
